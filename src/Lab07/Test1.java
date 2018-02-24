/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author omprakashnekkanti
 */
class Om {

    int x;
    int y;
    int z;
}

class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Om o1 = new Om();
//        int x = o1[0];
//        int y = o1[1];
//        int z = o1[2];// acess is not allowed, because it is not constant address everytime.class properties could be of different type

        StaticArrayList<String> k = new StaticArrayList<>(5);
        k.add(0, "om");
        Scanner x = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            try {
                int y = x.nextInt();
                System.out.println(k.get(y));
                i = 0;
            } catch (InputMismatchException | IndexOutOfBoundsException u) {
                System.out.println("0");
            }
        }
    }

}
