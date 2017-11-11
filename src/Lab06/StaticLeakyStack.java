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
public class StaticLeakyStack<P> implements LeakyStack<P> {

    private P[] x;
    int count,start;

    public StaticLeakyStack(int capacity) {
        this.x = (P[]) new Object[capacity] ;
//        this.count = 0;
//        this.start = -1;
    }

    @Override
    public void Push(P e) {
        int insertIndex= (start+count)%x.length;
        /*if(insertIndex==start)
        {
        start++;
        count--;
        }
        x[insertIndex] = e;
        count++;*/
        if(count==x.length && insertIndex==start)
        {
        start=(start+1)%x.length;
        x[insertIndex] = e;
        }
        else{
        x[insertIndex] = e;   
        count++;
        }
        
    }

    @Override
    public P Pop() {
        if(count==0) return null;
        P ret = x[((start+count-1)%x.length)];
        x[((start+count-1)%x.length)] = null;
        count--;
        return ret;
    }

    @Override
    public P Top() {
        return   x[((start+count)%x.length)-1];
    }

    @Override
    public int Size() {
        return count;
    }

    @Override
    public boolean IsEmpty() {
        if(count==0)return true;
        return false;
    }

}
