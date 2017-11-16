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
public class FinalClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("N               Array           Linked");
//        String test = String.format("%-10.3f", 3.1415926);
//        System.out.printf("|%s|%1$s%n", test, "hello");

        System.out.printf("%15s     %10s    %10s%n", "N", "Array", "LinkedList");
        boolean staticContinue = true;
        boolean dynamicContinue = true;
        String time1 = null, time2 = null;
        
        for (int N = 1000000; N > 0 && N < Integer.MAX_VALUE && (staticContinue || dynamicContinue); N *= 10) {
            
            try {
                LinkedListQueue<Integer> dq2 = new LinkedListQueue<>();
                long t13 = System.currentTimeMillis();
                for (int i = 1; i <= N; i++) {
                    dq2.enqueue(i);
                }
                long t14 = System.currentTimeMillis();

                LinkedListStack<Integer> ds2 = new LinkedListStack<>();
                long t15 = System.currentTimeMillis();
                for (int i = 1; i <= N; i++) {
                    ds2.push(dq2.dequeue());
                }
                long t16 = System.currentTimeMillis();

                long t17 = System.currentTimeMillis();
                for (int i = 1; i <= N; i++) {
                    dq2.enqueue(ds2.pop());
                }
                long t18 = System.currentTimeMillis();

                long ti1 = (t14 - t13) + (t16 - t15) + (t18 - t17);
                time1 = String.valueOf(ti1);
            } catch (OutOfMemoryError ex1) {
                time1 = "Out of Memory";
                dynamicContinue = false;
            }

            try {
                if(!staticContinue){
                    System.out.println(time2);
                }
                else{
                    StaticArrayQueue4<Integer> q1 = new StaticArrayQueue4<>(N);
                    long t1 = System.currentTimeMillis();
                    for (int i = 1; i <= N; i++) {
                        q1.enqueue(i);
                    }
                    long t2 = System.currentTimeMillis();

                    StaticArrayStack<Integer> s1 = new StaticArrayStack(N);
                    long t3 = System.currentTimeMillis();
                    for (int i = 1; i <= N; i++) {
                        s1.push(q1.dequeue());
                    }
                    long t4 = System.currentTimeMillis();

                    long t5 = System.currentTimeMillis();
                    for (int i = 1; i <= N; i++) {
                        q1.enqueue(s1.pop());
                    }
                    long t6 = System.currentTimeMillis();

                    long ti2 = (t2 - t1) + (t4 - t3) + (t6 - t5);

                    if(ti2 > 8492034893204892304){
                        time2 = "Out of time";
                        staticContinue = false;
                    }
                    else{
                        time2 = String.valueOf(ti2);
                    }
                }
                //System.out.printf("%,10d      " + "\t" + time + "\t" + time2 + "%n", N);
            } catch (OutOfMemoryError e) {
                time2 = "Out of Memory";
                staticContinue = false;
            }
            System.out.printf("%,15d    %10s    %10s%n", N, time2, time1);//right boundary of format specifier moves to right if there is no space to left
        }
    }

}
