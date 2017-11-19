/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author omprakashnekkanti
 */
public class LinkedListQueue<P> implements Queue<P> {

    private SinglyLinkedList<P> x ;
    
    
    public void enqueue(P elm) {
        x.addLast(elm);
    }

    public LinkedListQueue() {
        x= new SinglyLinkedList<P>();
    }

    
    public P dequeue() {
        return x.removeFirst();
    }

    
    public P first() {
       return x.getFirst();
    }

    
    public int size() {
        return x.getSize();
    }

    
    public boolean isEmpty() {
        return x.isEmpty();
    }
    
}
