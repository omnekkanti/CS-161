/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

/**
 *This class implements list interface too but difference is, the insert,remove  at i=0 & i=n would cost O(1)   
 * @author omprakashnekkanti
 */
public class StaticArrayListBigO1ForInsertAt0Index<P> implements List<P>{
private P[] x;
int count, front;

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
        int tempIndex = front+i;  
        if (tempIndex < front && tempIndex > (front+count - 1)%x.length) {
            throw new IndexOutOfBoundsException();
        }
        return x[tempIndex];
    }

    @Override
    public P set(int i, P e) throws IndexOutOfBoundsException {
        int tempIndex = front+i;
        if (tempIndex < front && tempIndex > (front+count - 1)%x.length) {
            throw new IndexOutOfBoundsException();
        }
        P temp = x[tempIndex];
        x[tempIndex] = e;
        return temp;
    }

    @Override
    public void add(int i, P e) throws IndexOutOfBoundsException, IllegalStateException {
        int tempIndex = front+i;
        if (tempIndex < front || tempIndex >= (front+count+1)%x.length) {
        throw new IndexOutOfBoundsException();
        }
        if (count == x.length) 
        throw new IllegalStateException("No more room");
        if(i==0 && tempIndex==front)
        {
            int insertPosition = (x.length+tempIndex-1)%x.length;
            x[insertPosition]=e;
            front = insertPosition;
            count++;
        }
        else{
        for (int p = (front+count)%x.length; p > tempIndex; p=(x.length+p-1)%x.length) {
        x[p] = x[(x.length+p - 1)%x.length];
        }
        B1:
        {
        x[tempIndex] = e;
        count++;
        }    }
    }

    public StaticArrayListBigO1ForInsertAt0Index(int p) {
        this.x = (P[])new Object[p];
    }

    @Override
    public P remove(int i) throws IndexOutOfBoundsException {
        int tempIndex = front+i;
        
//  if(tempIndex< front || tempIndex >= (front+count)%x.length) 
    if(tempIndex< front || tempIndex > (front+count-1)%x.length) // -1 is there because of greater than
        {
            throw new IndexOutOfBoundsException();
        }
        P temp = x[tempIndex];

        for (int p = tempIndex; p < (front+count- 1)%x.length; p=(x.length+p+1)%x.length) {
            x[p] = x[(x.length+p+1)%x.length];
        }
        x[count-1] = null;
        count--;
        return temp;
    }
    
}
