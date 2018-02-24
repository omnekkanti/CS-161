/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;


/**
 * Doubly Linked List Data structure implementation
 * @author omprakashnekkanti
 */
public class DoublyLinkedListImplementation<X> implements DoublyLinkedList<X> {
    
    private Node<X> head;
    private Node<X> tail;
    private int size; 

    public DoublyLinkedListImplementation() {
        this.head = new Node<>(null,null,null);
        this.tail = new Node<>(null,null,head);
        this.size = 0;
        head.setNext(tail);
    }
    

    public static class Node<X> {

        private X element;//available in the singlylinkedlist class directly even though private
        private Node<X> next;
        private Node<X> previous;
        

        public Node(X el, Node<X> next, Node<X> previous) {
            this.element = el;
            this.next = next;
            this.previous = previous;
        }

        public X getElement() {
            return element;
        }

        public Node<X> getNext() {
            return next;
        }
        public Node<X> getPrevious() {
            return previous;
        }

        public void setNext(Node<X> nxt) {
            this.next = nxt;
        }
        public void setPrevious(Node<X> prv) {
            this.previous = prv;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Node)) {
                return false;
            }
            Node<X> newest = (Node<X>) o;//jvm doesnt care about P-type parameter in methods as class definition is not maintained for each object
            return this.element.equals(newest.element);
        }

    }
    @Override
    public X first() {
            return head.next.getElement();
    }

    @Override
    public X last() {
        return tail.previous.element;//
    }

    @Override
    public void addFirst(X e) {
        Node<X> x = new Node<>(e,head.next, head);//element, next, previous
        head.next = x;
        size++;
        
    }

    @Override
    public void addLast(X e) {
        Node<X> x = new Node<>(e,tail, tail.previous);//element, next, previous
        tail.previous = x;
        size++;
    }

    @Override
    public X removeLast() {
      X temp = tail.previous.element;  
      tail.previous.next = null;
      tail.previous.previous.setNext(tail);
      size--;
      return temp;
    }

    @Override
    public X removeFirst() {
      X temp = head.next.getElement();
      head.next.setPrevious(null);
      head.next.next.previous = head;
      head.setNext(head.next.next);
//      head.next.setNext(null);  wrong statement  
      size --;
      return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size==0) return true;
        else return false;
    }
    
}
