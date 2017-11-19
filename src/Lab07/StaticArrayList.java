/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

import java.io.IOException;

/**
 *
 * @author omprakashnekkanti
 */
public class StaticArrayList<P> implements List<P> {

    private P[] x;
    private int count;

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public P get(int i) throws IndexOutOfBoundsException {
        if (i < 0 && i > count - 1) {
            throw new IndexOutOfBoundsException();
        }
        return x[i];
    }

    @Override
    public P set(int i, P e) throws IndexOutOfBoundsException {
        if (i < 0 && i > count - 1) {
            throw new IndexOutOfBoundsException();
        }
        P temp = x[i];
        x[i] = e;
        return temp;
    }

    @Override
    public void add(int i, P e) throws IndexOutOfBoundsException, IllegalStateException {

        if (i < 0 || i > count) {
        throw new IndexOutOfBoundsException();
        }
        if (count == x.length) 
        throw new IllegalStateException("No more room");
        
        for (int p = count; p > i; p--) {
        x[p] = x[p - 1];
        }
        B1:
        {
        x[i] = e;
        count++;
        }
        /*if (i == 0) {
        x[0] = e;
        count++;
        } else {
        if (i < 0 || i > count) {
        throw new IndexOutOfBoundsException();
        }
        
        for (int p = count; p > i; p--) {
        x[p] = x[p - 1];
        }
        B1:
        {
        x[i] = e;
        count++;
        }
        }*/
        
        
    }

    public StaticArrayList(int i) {
        this.x = (P[]) new Object[i];
    }

    @Override
    public P remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 && i >= count) {
            throw new IndexOutOfBoundsException();
        }
        P temp = x[i];

        for (int p = i; p < count- 1; p++) {
            x[p] = x[p + 1];
        }
        x[count-1] = null;
        count--;
        return temp;
    }

    public void test() throws IOException {
    }
}
