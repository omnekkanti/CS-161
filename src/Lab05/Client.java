/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

import java.util.Arrays;

/**
 *
 * @author omprakashnekkanti
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//
//        System.out.println(StaticArrayStack.capacity);
//        
//        Integer[] a
//                = {
//                    4, 8, 15, 16, 23, 42
//                };
//        // autoboxing allows this
//        
//        String[] s
//                = {
//                    "Jack",
//                     "Kate",
//                     "Hurley",
//                     "Jin",
//                     "Michael"
//                };
//       
//        System.out.println(
//                "a = "
//                + Arrays.toString(a));
//        
//        System.out.println(
//                "s = "
//                + Arrays.toString(s));


        System.out.println("Storing Integers into Static Queue DataStructure");
        
        System.out.println("Start of Queueing: ");
        StaticArrayQueue4<Integer> q1 = new StaticArrayQueue4<>(1000000);
        long t1 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            q1.enqueue(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("End of Queueing: ");
        
        System.out.println("Storing Integers into Static StacK DataStructure from Static Queue");
       
        System.out.println("Start of Dequeing: ");    
        StaticArrayStack<Integer> s1 = new StaticArrayStack(1000000);
        long t3 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            s1.push(q1.dequeue());
        }
        long t4 = System.currentTimeMillis();
        System.out.println("End of Dequeing onto the stack: "); 
        
        System.out.println("Popping Integers from Static StacK DataStructure into static Queue");
       
        System.out.println("Start of Popping: ");    
        long t5 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            q1.enqueue(s1.pop());
        }
        long t6 = System.currentTimeMillis();
        System.out.println("End of Popping into the queue: ");
        long time = (t2-t1)+(t4-t3)+(t6-t5);
        System.out.println("Run-Time for static classes: "+ time);
        
//        Part2
    System.out.println("\nStoring Integers into Dynamic Queue DataStructure");
        
        System.out.println("Start of Queueing: ");
        LinkedListQueue<Integer> dq1 = new LinkedListQueue<>();
        long t7 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            dq1.enqueue(i);
        }
        long t8 = System.currentTimeMillis();
        System.out.println("End of Queueing: ");
        
        System.out.println("Storing Integers into Dynamic StacK DataStructure from Dynamic Queue");
       
        System.out.println("Start of Dequeing: ");    
        LinkedListStack<Integer> ds1 = new LinkedListStack<>();
        long t9 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            ds1.push(dq1.dequeue());
        }
        long t10 = System.currentTimeMillis();
        System.out.println("End of Dequeing onto the stack: "); 
        
        System.out.println("Popping Integers from Dynamic StacK DataStructure into Dynamic Queue");
       
        System.out.println("Start of Popping: ");    
        long t11 = System.currentTimeMillis();
        for (int i=1;i<=1000000;i++)
        {
            dq1.enqueue(ds1.pop());
        }
        long t12 = System.currentTimeMillis();
        System.out.println("End of Popping into the queue: ");
        long time1 = (t8-t7)+(t10-t9)+(t12-t11);
        System.out.println("Run-Time for Dynamic Classes: "+ time1);
//        for(int N = 1000000; N < Integer.MAX_VALUE; N *= 10){
//            
//        }
        
    }

}
