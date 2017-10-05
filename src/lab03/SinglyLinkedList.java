/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Om
 */
public class SinglyLinkedList<I> {

    private Node<I> head;
    private Node<I> tail;
    private int size;

    private static class Node<P> {

        private P element;
        private Node<P> next;

        public Node(P el, Node<P> next) {
            this.element = el;
            this.next = next;
        }

        public P getElement() {
            return element;
        }

        public Node<P> getNext() {
            return next;
        }

        public void setNext(Node<P> nxt) {
            this.next = nxt;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Node)) {
                return false;
            }
            Node<P> newest = (Node<P>) o;
//            System.out.println(newest.element.getClass().getName());
//            System.out.println(newest.next.getClass().getName());
            
            return this.element.equals(newest.element);
        }

    }
    
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("Hello", null);
        Node<Integer> n2 = new Node<>(21, null);
        
        Node<String> n4 = (Node<String>) n2;
        
        System.out.println(n1.equals(n2));
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(I elm) {
        head = new Node<I>(elm, head);
        size++;
        if (size == 1) {
            tail = head;
        }
    }

    public void addLast(I elem) {
        Node<I> n = new Node<>(elem, null);
        if (size == 0) {
            head = n;
//            tail= n;
//            size++;
        } else {
            this.tail.setNext(n);
        }
        tail = n;
        size++;
//        if (size == 1) {
//            head = tail;
//        }
    }

    public String toString() {
        String output = "[";
        Node<I> current = head;
        while (current != null) {
            if (current != head) {
                output += ", ";
            }
            output += current.getElement().toString();
            current = current.next;
        }
        return output + "]";
    }

    public boolean equals(Object o) {
        if (!(o instanceof SinglyLinkedList)) {
            return false;
        }
        SinglyLinkedList c = (SinglyLinkedList) o;
        if (this.size == c.size) {
            Node current = this.head, other = c.head;
            
            while (current!=null && other != null)
            {
                if(!(current.getElement().equals(other.getElement())))
                   return false ;
                current= current.getNext();
                other = other.getNext();
            }
            if(current == null && other == null){
                return true;
            }
        }
        return false;
    }

    

    public I removeFirst() {
        if (size==0) throw new IllegalStateException("List is empty");
        I item = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = head;
        }
        return item;
    }
/** removes element using the reference provided*/
    public boolean remove(I elm) {
        Node<I> previous = null, current = head;
        while (current != null) {
            if (current.element.equals(elm)) {
                if (previous == null) {
                    removeFirst();
                } else {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    size--;
                }

                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }
/** removes element using index provided*/
    public I remove(int num) {
        if (size == 0) {
            throw new IllegalStateException("List is empty or out of bounds");
        }
        int index = 0;
        Node<I> previous = null, current = head;
        while (current != null) {
            if (index == num) {
                if (previous == null) {
                    removeFirst();
                } else {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                }
                size--;
                return current.getElement();
            }
            previous = current;
            current = current.getNext();
            index++;
        }
        return null;//it will never come here
    }

    public I removeLast() {
        if (size==0){ throw new IllegalStateException("List is empty");}
        I item = null;
        Node<I> x, h = head;
        for (int i = 1; i < size - 1; i++) {
            h = h.getNext();
        }
        x = h.getNext();
        item = x.getElement();
        h.setNext(null);
        tail= h;
        size--;
        return item;
    }

    public int getFreq(I elm) {
        int count = 0;
        Node<I> current = head;
        while (current != null) {
            if (current.getElement().equals(elm)) {
                count++;
            }
            current = current.getNext();
        }
        return count;
    }

    public boolean Contains(I elm) {
        boolean flag = false;
        Node<I> current = head;
        while (current != null) {
            if (current.getElement().equals(elm)) {
                flag = true;
            }
            current = current.getNext();
        }
        return flag;
    }
}
