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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String time1=null, time2=null;
//        try{
//            int x;
//        time1=String.valueOf(0);
//        }
//        catch(OutOfMemoryError ex1){
//       int x=0;
//        }
//        try{
//        time2=i;
//        }
//        catch(OutOfMemoryError ex2){}
//        System.out.printf("%s,%s",x,time2);
           
//System.out.printf("%,d",Integer.MAX_VALUE);
int n = (int)10000000000;
for(int i=n;i<Integer.MAX_VALUE;i=i*10){
    System.out.printf("%,d",i);   
}
byte b =(byte)128;
        System.out.println(b);

    }
    
}