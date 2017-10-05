
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omprakash.nekkanti
 */
public class Scores implements Bag {
    
    private int[] list;
    private int count;
    
//    public int[] getList()
//    {
//        return list;
//    }
    public int getCount()
    {
        return count;
    }
    public Scores()
    {
        list = new int[50];
    }
    
    public Scores(int d)
    {
        list = new int[d];
    }
    
    /**
     *
     *  @return
     */
    @Override
    public int getCurrentSize()
    {
        return count;
    }
    
    @Override
    public boolean isEmpty()
    {
        if (count==0)
            return true;
        return false;
        
    }
    
    public void clear ()
    {
        count = 0;
        //list = new int[list.length];
    }
    
    public void add(int num)
    {
        if(count>=list.length)
        {
            increaseArray(2);
        }
        
        list[count]= num;
        count++;
    }
    
    private void increaseArray(int factor){
        int[] temp = new int[factor*list.length];
        for(int i=0;i<count;i++)
        {
            temp[i] = list[i];
        }
        list = temp;
        temp = null;
    }
    
    public int getFrequencyOf(int num)
    {
        int freq=0;
        
        for (int i=0;i<count;i++)
        {
            if (list[i]==num)
                freq++;
        }
        return freq;
    }
    
    public boolean contains(int num)
    {
       boolean b = false;
       for (int i=0; i<count;i++)
       {
           if (list[i]==num)
           {
               b= true;
               //break;
               return b;
           }
          
       }
       return b;
    }
    
    public void remove (int num)
    {
       for (int i=0; i<count;i++)
       {
           if (list[i]==num)
           {
                count--;
                for(int j=i;j<count;j++)
                {
                    list[j]=list[j+1];             
                }
                break;
           }     
       } 
    }
    
    public void remove( )
    {
        if(count == 0)
        {
            throw new IllegalStateException("Cannot remove from empty bag");
        }
        
        int num = new Random().nextInt(count);
        
        remove(list[num]);
        
        
//        int k = 0;
//        
//        for (int i=0; i<list.length;i++)
//       {
//           if (list[i]==num)
//           {
//              list[i]= 0;;
//              count--;
//              k=i;
//              break;
//           }     
//       } 
//        
//        for(int i=k;i<count;i++)
//       {
//           list[i]=list[i+1];             
//       }            
    }
    
    public int get(int i)
    {
        if(i>=count || i < 0)
        {
             throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + i);
        }
        
        return list[i];
        
//        if(i<count-1)
//            return list[i];
//        throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + i);
    }
    
    public String toString( ){
     
        String returnString = getClass().getName() + ":" + "[";
        
        for(int i=0;i<count;i++)
        {
            returnString += list[i]+",";
        }
        returnString += "\b]";
        return returnString;   
    }
    
    public boolean equals(Object o){
        boolean flag = true;
        
        if (!(o instanceof Scores))
            return false;
        Scores s = (Scores)o;
        for (int i=0;i<count;i++)
        {
            if(list[i]!=s.list[i])
            {
                flag = false;
                break;
            }
            
        }
        
        return flag;
    }
}
