/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

class One {

    int x;
    boolean y;

    public One() {
        x = 10;
        y = false;
    }

    /**
     * method to print state of object of One class
     */
    public void m1() {
        System.out.println("object variables");
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public String toString() {
        return "One{" + "x=" + x + ", y=" + y + "}";
    }
    
    

}

class Two {

    static One pi=new One();

    Two() {
        pi = new One();
    }
}

/**
 *
 * @author omprakashnekkanti
 */
public class Test1 {

    public static void main(String[] args) {
//        System.out.println("10 % 3 =? 1 = " + (10 % 3));
//        System.out.println("-10 % 3 =? -1 = " + (-10 % 3));
//        System.out.println("10 % -3 =? 1 = " + (10 % -3));
//        System.out.println("-10 % -3 =? -1 = " + (-10 % -3));
//        System.out.println(3.5%2);
//        System.out.printf("%2$s Mr.%1$s%n", "test", "hello");
//        System.out.printf("%2$d + %1$d = %d%d%d", 1 ,2,3);

//       Two x=(Two) new Two();
//       x.//ststic field supposed to be visible?
//new Two();
//        Two.pi.m1();
//        int[] om = {1,2,3};
//        System.out.println(om.length);


/*for(int i=1000000;i>0 && i<1000000001;i*=10){
System.out.println(i);
}*/
/*for(int i=1000000;i>0 && i<Integer.MAX_VALUE;i*=10){
System.out.println(i);
            }*/
for(int i=1000000;i<Integer.MAX_VALUE;i*=10){
                System.out.println(i);
            }
        
//        One x = new One();
//        System.out.printf("%s",x);
//        for(float i = 1;i<=200;i++){
//            System.out.println("Division of "+i+" with 2 "+"leaves us with remainder "+i%2);
//        }
//
//    Object [] x = new Object[3];
//        System.out.println(x[1]);
//        
//    String [] y = new String[3];
//        System.out.println(y[2]);
    }
}
