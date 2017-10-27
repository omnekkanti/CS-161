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
public class StaticArrayStack<E> implements Stack<E> {

/**
 *
 * gives the default capacity of ArrayStack
 */
    public static final int capacity = 1000;//why do we need to do it..
    private E[] x;
    int i;//index for the next insert

    public StaticArrayStack() {
        x = (E[]) new Object[capacity];
    }

    public StaticArrayStack(int cap) {
        x = (E[]) new Object[cap];
    }

    @Override
    public void push(E e) {
        if (size() == x.length) {
            throw new IllegalStateException("stack is full");
        }
        x[i] = e;
        i++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E r = x[i-1];
        x[i-1] = null;//for garbage collection
        i--;
        return r;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return x[i-1];
    }

    @Override
    public int size() {
        return i;
    }

    @Override
    public boolean isEmpty() {
        if (i == 0) {
            return true;
        }
        return false;
    }

}
