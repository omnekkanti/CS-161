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
public class LinkedListStack<E> implements Stack<E> {

    private SinglyLinkedList<E> stack = new SinglyLinkedList<>();
    
    @Override
    public void push(E e) {
        stack.addFirst(e);
    }

    @Override
    public E pop() {
       return stack.removeFirst();
    }

    @Override
    public E top() {
        return stack.getFirst();//does it return a copy of address stored up in variable
    }

    @Override
    public int size() {
        return stack.getSize();//does it return a copy of value in variable
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
