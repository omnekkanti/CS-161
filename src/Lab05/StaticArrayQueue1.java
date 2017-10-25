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
public class StaticArrayQueue1<P> implements Queue<P> {
    
    P[] x ;
    int i;

    public StaticArrayQueue1(int capacity) {
        x = (P[])new Object[capacity];
    }

    @Override
    public void enqueue(P elm) {
        x[i]= elm;
        i++;
    }

    @Override
    public P dequeue() {
        P xi = x[0];//referencing is one and assignment is one
        x[0] = null;//2
        //1
        for(int s=0;s<i;s++){//n,n-1
            x[s]=x[s+1]; //4n   
        }
        return xi;//1
    }

    @Override
    public P first() {
        return x[0];
    }

    @Override
    public int size() {
        return i-1;
    }

    @Override
    public boolean isEmpty() {
        if (i == 0) {
            return true;
        }
        return false;
    }
    
}
