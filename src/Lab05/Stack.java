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
public interface Stack<E> {
    
    public void push(E e);
    public E pop();
    public E top();
    public int size();
    public boolean isEmpty();
}
