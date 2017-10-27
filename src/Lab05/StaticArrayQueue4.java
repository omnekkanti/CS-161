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
public class StaticArrayQueue4<P> implements Queue<P>{
    
    P[] x;
    int size, front;
    
    public StaticArrayQueue4(int capacity) {
        x =(P[])new Object[capacity];// it is better to write declare constants beiing used in the program as variables at class level for maintainability.
    }
    
    @Override
    public void enqueue(P elm) {
        int insertPosition = (front+size)%x.length;
        x[insertPosition]=elm;
        size++;
    }

    @Override
    public P dequeue() {
       P ret=x[front];//2
       x[front]=null;//2
      front=(front+1)%x.length;//4
      size--;//2
       return ret;//1
    }

    @Override
    public P first() {
        P ret = x[front];
        return ret;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
         if (size() == 0) {
            return true;
        }
        return false;
    }
    
}
