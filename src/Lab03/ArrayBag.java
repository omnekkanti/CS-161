/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.Random;

/**
 *
 * @author Omprakash
 */
public class ArrayBag<O> implements Bag<O> {

    O[] list;
    int count;
    
    public ArrayBag(){
    list = (O[])new Object[50];
    }
    
    public ArrayBag(int num){
    list = (O[])new Object[num];
    }
    @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count==0)
            return true;
        return false;             
    }

    @Override
    public boolean isFull() {
        if(count == list.length)
            return true;
        return false;
    }

    @Override
    public boolean add(O num) {
       if(isFull())
           increaseArray(2);
       list[count]=num;
       count++;
       return true;  
    }

    private void increaseArray(int num){
       O[] temp = list;
       list = (O[])new Object[num*list.length];
       for(int i=0;i<temp.length;i++)
       {
            list[i]=temp[i];
       }
       temp = null;
    }
    @Override
    public boolean remove(O num) {
        boolean flag=true;
       for(int i=0; i<list.length;i++)
       {
          if (num.equals(list[i]))
          {
              list[i]= null;
              count--;
              for(int j=i; j<count;j++)
              {
                  list[j]=list[j+1];
              }
              return flag; 
              
           }
          else if(i==list.length-1){
          flag = false;
          }    
       }
       return flag;
    }

    @Override
    public O remove() {
        if (count==0)
        {
            throw new IllegalStateException("Cannot remove from empty bag");
        }
        int num = new Random().nextInt(count);
        O x = list[num];
        remove(x);
        return x;        
    }

    @Override
    public void clear() {
        list = (O[])new Object[count];
    }

    @Override
    public int getFrequencyOf(O num) {
       int count=0;
       for(int i=0;i<list.length;i++)
       {
          if(list[i].equals(num)){count ++;} 
       }
       return count;
    }

    @Override
    public boolean contains(O num) {
        for(int i=0;i<list.length;i++)
        {
            if (list[i].equals(num)){
            return true;
            }
        }
        return false;
        
    }
    
    public boolean equals(Object arr){
        if (!(arr instanceof ArrayBag))
            return false;
        ArrayBag a = (ArrayBag)arr;
        
        if (count != a.count)
        {return false;}
        
        for(int i=0;i<count;i++)
        {
           if(!list[i].equals(a.list[i]))
           {return false;} 
        }
        return true;
    }
    
    @Override
    public String toString(){
        
        String returnString = getClass().getName()+": "+ "[";
        
        for(int i=0;i<count;i++)
        {
            returnString  += list[i].toString()+"; ";
        }
        returnString = "\b]";
        
        return returnString;
    }
}
