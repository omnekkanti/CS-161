/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author Om
 */
public class SinglyLinkedList<I> {

    private Node<I> head;
    private Node<I> tail;
    private int size;

    private static class Node<P> {

        private P element;//available in the singlylinkedlist class directly even though private
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
            Node<P> newest = (Node<P>) o;//jvm doesnt care about P-type parameter in methods as class definition is not maintained for each object
            System.out.println(newest.element.getClass().getName());
//            System.out.println(newest.next.getClass().getName());

            return this.element.equals(newest.element);
        }

    }

    /* public static void main(String[] args) {
    Node<String> n1 = new Node<>("Hello", null);
    Node<Integer> n3 = new Node<>(21, null);
    Node n2 = new Node<Double>(21.5, null);
    n2 = new Node<>(true, null);
    System.out.println(n2.element.getClass().getName());//ask aaron
    //n1 = new Node<Object>(56,null);
    Node<Integer> n4 = (Node<Integer>) n2;
    //        System.out.println(n4.element);
    //        System.out.println(n4.element.getClass().getName());
    System.out.println(n1.equals(n3));
    Node n5 = new Node<>("String",null);
    Node<Integer> n6 = (Node<Integer>)n5;
    System.out.println(n6.equals(n5));
    
    //        Node<String> n7 = new Node<>("n7",null);
    //        Node<Integer> n8 = (Node<Integer>)n7;
    
    Node n9 = new Node<>("n9",null);
    Node<Integer> n10 = (Node<Integer>)n9;
    //       Node<Integer> n11 = (Node<Integer>)new Node<>("n11",null);
    System.out.println(n10.element);
    System.out.println(n10.element.getClass().getName());
    //foo(n2);
    }*/
 /*public static void foo(Node<Integer> node)
    {
    System.out.println(node.getElement().intValue());
    }*/
    public int getSize() {
        return size;
    }
/**
 * returns the first element in linked list
 */
    public I getFirst() {
        return head.getElement();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(I elm) {
        head = new Node<I>(elm, head);//3. a primitive operation is one which cant be broken down into further operations
        size++;//2
        if (size == 1) {//1
            tail = head;//1
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
            Node<I> current = this.head, other = c.head;

            while (current != null && other != null) {
                if (!(current.getElement().equals(other.getElement()))) {
                    return false;
                }
                current = current.getNext();
                other = other.getNext();
            }
            if (current == null && other == null) {
                return true;
            }
        }
        return false;
    }

    public I removeFirst() {
        if (size == 0) {//1
            throw new IllegalStateException("List is empty");//3
        }
        I item = head.getElement();//2
        head = head.getNext();//2
        size--;//2
        if (size == 0) {//1
            tail = head;//1
        }
        return item;//1
    }

    /**
     * removes element using the reference provided
     */
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

    /**
     * removes element using index provided
     */
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
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        I item = null;
        Node<I> x, h = head;
        for (int i = 1; i < size - 1; i++) {
            h = h.getNext();
        }
        x = h.getNext();
        item = x.getElement();
        h.setNext(null);
        tail = h;
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
