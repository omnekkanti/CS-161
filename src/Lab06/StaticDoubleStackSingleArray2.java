/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author omprakashnekkanti
 */
public class StaticDoubleStackSingleArray2<P> implements DoubleStack<P> {

    private P[] x;
    int insertIndexRed, insertIndexBlue /*=x.length - 1*/;

    public StaticDoubleStackSingleArray2(int capacity) {
        this.x = (P[]) new Object[capacity];
        this.insertIndexRed = 0;
        this.insertIndexBlue = x.length - 1;
    }

    @Override
    public void redPush(P e) {
        if (insertIndexRed == insertIndexBlue + 1) {
            throw new IllegalStateException("No more room");
        }
        x[insertIndexRed] = e;
        insertIndexRed++;
    }

    @Override
    public P redPop() {
        P ret = x[insertIndexRed - 1];
        x[insertIndexRed - 1] = null;
        insertIndexRed--;
        return ret;
    }

    @Override
    public P redTop() {
        return x[insertIndexRed];
    }

    @Override
    public int redSize() {
        return insertIndexRed;
    }

    @Override
    public boolean redIsEmpty() {
        if (insertIndexRed == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void bluePush(P e) {
        if (insertIndexBlue == insertIndexRed - 1) {
            throw new IllegalStateException("No more room");
        }
        x[insertIndexBlue] = e;
        insertIndexBlue--;
    }

    @Override
    public P bluePop() {
        P ret = x[insertIndexBlue + 1];
        x[insertIndexBlue+1] = null;
        insertIndexBlue++;
        return ret;
    }

    @Override
    public P blueTop() {
        return x[insertIndexBlue];
    }

    @Override
    public int blueSize() {
        return x.length - insertIndexBlue;
    }

    @Override
    public boolean blueIsEmpty() {
        if (insertIndexBlue == x.length - 1) {
            return true;
        }
        return false;

    }

}
