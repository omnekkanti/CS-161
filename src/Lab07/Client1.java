/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

/**
 *
 * @author omprakashnekkanti
 */
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticArrayList<Integer> om = new StaticArrayList<>(10);
        int[] test = new int[10];
        for(int i=0;i<10;i++)
        {
            om.add(i, (i+1));
        }
        
        /*test[1]=om.remove(10);
        System.out.println(test[1]);*/
        
        for(int i=0;i<10;i++)
        {
        test[i] = om.remove(0);//how do i execute it ten times without incrementing i
        }
        
        /*int i=0;
        while(i<10)
        {
        test[i] = om.remove(0);
        i++;
        }*/
        
        for(int i=0;i<10;i++)
        {
        System.out.println("test["+i+"]: "+test[i]);
        }
        
//        om.test();

        
    }
    
}
