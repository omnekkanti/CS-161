/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author omprakashnekkanti
 */
public class Recursion {

    public static double harmonicNumber(double num) {

        if (num == 1) {
            return 1;
        } else {
            double returnValue = harmonicNumber(num - 1);
            double answer = (1 / num) + returnValue;
            return answer;
        }
    }

    /**
     * This method will return the sum of the first 2^n ints where n is a non-negative integer in the file specified at path
     * @param path The path of the file
     * @return the sum of the first 2^n elements, where n is a non-negative integer
     * @throws FileNotFoundException If the specified file cannot be found
     */
    public static int isabelsTechnique(File path) throws FileNotFoundException {

        Scanner x = new Scanner(path).useDelimiter(",");
//    1st way Input should be in one line
        /*String pi = x.nextLine();
          String cx[] =pi.split(",");*/
//    2nd way of counting the number of tokens.
        int count1 = 0;
        while (x.hasNext()) {
            count1++;
            x.next();//not in api about cursor going forward
        }
//       creating int arrray with the size of string array assuming every value is integer in there 
        /*int n = cx.length;
           int y[] = new int[n];*/
//      creating an array with no of tokens found in the file object
        //int n = count1;
        int y[] = new int[count1];
//        int index = 0;
//      loading integer array created while skipping other values(not int)
        int count = 0;
        Scanner sc = new Scanner(path).useDelimiter(",");
        for (int i = 0; i < count1; i++) {
            try {
                // y[count]= Integer.parseInt(cx[i]);
                y[count] = sc.nextInt();//advances cursor and places it infront of the delimiter
                count++;
            } catch (InputMismatchException | NumberFormatException ex) {
                sc.next();
            }
//            finally {
//            x.close();
//            sc.close();
//            }
//                y[index] = x.nextInt();
//                index++;
        }
//     Reducing the size of the int array created by creating new array of size count that indicates parsed ints   
        int z[] = new int[count];
//        populating it with values of int array
        for (int i = 0; i < count; i++) {
            z[i] = y[i];
        }
        
        
        System.out.println("Calling isabels Technique method on following values extracted from file: " + z.toString());

        return isabelsTechnique(z);

    }

    public static int isabelsTechnique(int[] z) {
        if (z.length == 1) {
            return z[0];
        }
        int[] temp = new int[(z.length / 2)];
        for (int i = 0; i < (temp.length); i++) {
            temp[i] = z[2 * i] + z[(2 * i) + 1];
        }

        return isabelsTechnique(temp);

//        while (temp.length != 1) {
//            
//            y = temp;
//            temp = new int[temp.length / 2];
//        }
//        return y[0];
    }

    public static String[] find(File path) {
        String x[] = path.list();
        return x;
    }

}
