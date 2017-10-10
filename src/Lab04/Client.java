/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author omprakashnekkanti
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        int integer = 2;
        double d = integer;
        double e = 2;
        String optionString = "Enter \"A\" to run Harmonic method \nEnter \"B\" to run Isabel's method\nEnter \"C\" to run find method";

        String message = JOptionPane.showInputDialog(null, optionString, "Selection of Recursive method", 0);

        switch (message) {
            case "a":
            case "A":
                String input1 = JOptionPane.showInputDialog(null, "Number", "Enter Harmonic Number", 0);
                System.out.println("Calling Harmonic function with arguement: "+ input1);
                double x = Integer.parseInt(input1);//not allowing to store in double var
                System.out.println(Recursion.harmonicNumber(x));
                break;
            case "b":
            case "B":
                String input2 = JOptionPane.showInputDialog(null, "Enter File Path", "Isabel's Technique", 0);
                File y2 = new File(input2);
                try {
                    System.out.println(Recursion.isabelsTechnique(y2));
                } catch (FileNotFoundException f) {
                    System.err.println("File does not exist, Enter the path again");
                }
                break;
            case "c":
            case "C":
                String input3 = JOptionPane.showInputDialog(null, "Enter the path for Entry in the file system", "Find Method", 0);
                System.out.println("Calling find method with file object created using arguement: "+input3);
                File z = new File(input3);
                String v[] = Recursion.find(z);
                System.out.println("Following are the entires in the path entered");
                for (int i = 0; i < v.length; i++) {
                    System.out.println("Entry: " + i + " = " + v[i]);
                }
                break;
            default:
                System.out.println("Choose one of the 3 Recursion methods");
        }

    }

}
