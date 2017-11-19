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
        String test = String.format("%-10.3f", 3.1415926);
        System.out.printf("|%2$s|%1$s%n", test, "hello");
        System.out.printf("|%2$s|%s%n", test, "hello");
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
//int x = 07433279;
int n = (int)2147483648l;
System.out.println(n);
        /*int u=1;
        if(u==1)
        {
        int ty=90;
        }
        else
        {
        System.out.println(ty);
        }*/
//        int n = 1;
        switch (n) {
            case 0:
                int t = 100;
                System.out.println(t);
                break;
            case 1:
               // System.out.println(t); //t not initilaized
                t = 200;
                System.out.println(t);
                break;
            case 2:

                break;
        }
//for(int i=n;i<Integer.MAX_VALUE;i=i*10){
//    System.out.printf("%,d",i);   
//}
        byte b = (byte) 128;
        System.out.println(b);

        boolean c = false;
        if (c == false) {
            System.out.println("you ate it");
        }
    }

}
