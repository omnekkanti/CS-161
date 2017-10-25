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
public class StaticArrayQueue2<P> implements Queue<P>{
    
    P[] x;
    int i, front;
    
    public StaticArrayQueue2() {
        x =(P[])new Object[1000];// it is better to write declare constants beiing used in the program as variables at class level for maintainability.
    }
    
    @Override
    public void enqueue(P elm) {
        x[i]= elm;
        if(i==0)
        front = i;
        i++;
    }

    @Override
    public P dequeue() {
       P ret = x[front];
       x[front]=null;
       front++;
       return ret;
    }

    @Override
    public P first() {
        P ret = x[front];
        return ret;
    }

    @Override
    public int size() {
        return i-front;
    }

    @Override
    public boolean isEmpty() {
         if (size() == 0) {
            return true;
        }
        return false;
    }
    
}
