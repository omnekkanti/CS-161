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
public class StaticArrayQueue3<P> implements Queue<P>{
    
    P[] x;
    int nextInsertPos, front = -1;
    
    public StaticArrayQueue3() {
        x =(P[])new Object[1000];// it is better to write declare constants beiing used in the program as variables at class level for maintainability.
    }
    
    @Override
    public void enqueue(P elm) {
        if(nextInsertPos == front){
            throw new IllegalStateException("No more room");
        }
        x[nextInsertPos] = elm;
//        if(nextInsertPos==0)
//            front = nextInsertPos;
        if(front == -1){
            front = 0;
        }
        
        nextInsertPos=(nextInsertPos+1)%x.length;
    }

    @Override
    public P dequeue() {
        if(front == -1){//1
            throw new IllegalStateException("Nothing to dequeue");//1
        }
        
        P ret = x[front];//2
        x[front]=null;//2
        front=(front+1)%x.length;//3
        
        if(front == nextInsertPos){//1
            front = -1;//1
            nextInsertPos = 0;//1
        }
        
        return ret;//1
    }

    @Override
    public P first() {
        if(front == -1){
            throw new IllegalStateException("Nothing to dequeue");
        }
        P ret = x[front];
        return ret;
    }

    @Override
    public int size() {
        
        //case 1: empty
        if(front == -1){
            return 0;
        }
        //case 2: full
        else if(nextInsertPos == front){
            return x.length;
        }
        //case 3: ip > front
        else if(nextInsertPos > front){
            return nextInsertPos - front;
        }
        //case 4: ip < front
        else{ //if(nextInsertPos < front){
            return x.length - (front - nextInsertPos);
        }
        
        /*
        if (nextInsertPos>front)
            return nextInsertPos-front;// 3 4 5 6 7 8(back-front)
        else if(nextInsertPos<front){return x.length-(Math.abs(front-nextInsertPos));} 
        else return 0;// 8 7 6 5 4 3*/
    }

    @Override
    public boolean isEmpty() {
         if (size() == 0) {
            return true;
        }
        return false;
    }
    
}
