/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author omprakashnekkanti
 */
public class Test {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner x = new Scanner(new File("/Users/omprakashnekkanti/Desktop/Fall2017-CS161/Java-161/Homeworks/H-4/SourceForNumbers.txt")).useDelimiter(",");
//        String pi = x.nextLine();
//        String cx[] =pi.split(",");  
//        int cvb[] = {1,2,3};
//        System.out.println(cvb.toString());
//        System.out.println(cx.toString());
//        for(int i=0;i<cx.length;i++)
//        {
//            System.out.println(cx[i]);
//        }

    String source = " 1    2 3\t4\n5 6 7\n\n\n8           ";
    
//    String source = "1,2,3,4\n5,6,7,8";
    String delimiter = "(\\s|,)+"; //[\r\f\v\n\t ]+ or ,+
        for(String token : source.split(delimiter)){
            System.out.print("'" + token + "'");
            try{
                Integer.parseInt(token);
                System.out.println("\ttrue");
            }
            catch (Exception e){
                System.out.println("\tfalse");
            }
        }
    }
     
        
}
