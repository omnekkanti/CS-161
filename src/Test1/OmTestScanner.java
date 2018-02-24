/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.regex.Pattern;

/**
 *
 * @author omprakashnekkanti
 */
public class OmTestScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pattern p = Pattern.compile("\\s+");
       boolean h = p.matcher("").matches();
        System.out.println(h);
    }
    
}
