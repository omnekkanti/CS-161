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
public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
        for (int N = 1000000; N < Integer.MAX_VALUE; N *= 10) { 
        System.out.println("Storing Integers into Static Queue DataStructure");

        System.out.println("Start of Queueing: ");
        StaticArrayQueue4<Integer> q1 = new StaticArrayQueue4<>(N);
        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            q1.enqueue(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("End of Queueing: ");

        System.out.println("Storing Integers into Static StacK DataStructure from Static Queue");

        System.out.println("Start of Dequeing: ");
        StaticArrayStack<Integer> s1 = new StaticArrayStack(N);
        long t3 = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            s1.push(q1.dequeue());
        }
        long t4 = System.currentTimeMillis();
        System.out.println("End of Dequeing onto the stack: ");

        System.out.println("Popping Integers from Static StacK DataStructure into static Queue");

        System.out.println("Start of Popping: ");
        long t5 = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            q1.enqueue(s1.pop());
        }
        long t6 = System.currentTimeMillis();
        System.out.println("End of Popping into the queue: ");
        long time = (t2 - t1) + (t4 - t3) + (t6 - t5);
        System.out.println("Run-Time for static classes: " + time);
        }
       }
        catch(OutOfMemoryError e){
            e.printStackTrace();
        }
    }
}
