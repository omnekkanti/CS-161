/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import Lab05.StaticArrayStack;

/**
 *
 * @author omprakashnekkanti
 */
public class StaticDoubleStackSingleArray<P> implements DoubleStack<P> {

    private P[] x;
    private int blueFront/*=x.length/2*/, redFront;
    private int blueSize, redSize;

    public StaticDoubleStackSingleArray(int capacity) {
        x = (P[]) new Object[capacity];
        blueFront = x.length / 2;
        redFront = 0;
        blueSize = 0;
        redSize = 0;
    }

    @Override
    public void redPush(P e) {
        if (redSize == x.length / 2) //System.out.println("no room"); 
        {
            throw new IllegalStateException("no more room");
        }
        int insertPosition = (redFront + redSize);
        x[insertPosition] = e;
        redSize++;
    }

    @Override
    public P redPop() {
        if (redSize == 0) {
            return null;
        }
        P ret = x[redFront + redSize-1];
        x[redFront + redSize-1] = null;
        redSize--;
        return ret;
    }

    @Override
    public P redTop() {
        if (redSize == 0) {
            return null;
        }
        return x[redFront + redSize];
    }

    @Override
    public int redSize() {
        return redSize;
    }

    @Override
    public boolean redIsEmpty() {
        if (redSize == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void bluePush(P e) {
        if (blueSize == x.length / 2) //System.out.println("no room"); 
        {
            throw new IllegalStateException("no more room");
        }
        int insertPosition = (blueFront + blueSize);
        x[insertPosition] = e;
        blueSize++;
    }

    @Override
    public P bluePop() {
        if (blueSize == 0) {
            return null;
        }
        P ret = x[blueFront + blueSize-1];
        x[blueFront + blueSize-1] = null;
        blueSize--;
        return ret;
    }

    @Override
    public P blueTop() {
        if (blueSize == 0) {
            return null;
        }
        return x[blueFront + blueSize];
    }

    @Override
    public int blueSize() {
        return blueSize;
    }

    @Override
    public boolean blueIsEmpty() {
        if (blueSize == 0) {
            return true;
        }
        return false;
    }

}
