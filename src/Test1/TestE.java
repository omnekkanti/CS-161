/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omprakashnekkanti
 */
public class TestE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("fish\foutlet"); /* decimal value=12, it is a pagebreak, it means go to the start of a new page */
//        System.out.println("white space characters in java are used to seperate tokens(keywords,seperators,comments,operators,identifiers,literals) in java source file");
//        System.out.println(". is a Memory access operator");
////        System.out.println("fish\soutlet");\s doesnt exist
////        System.out.println("fish\voutlet"); vertical tab doesnt exist.
//        
//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input);
//        System.out.println(s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)"));
//        System.out.printf("\"\" matches as a delimiter. No need to advance the cursor.%n");
//        String source = "aeiou";
//        String s1="qw";
//        System.out.println(s1.length());
//        System.out.print(s1.substring(1,2));//substring on string length returns empty string
//        String pt = "\\s+";
//        Pattern io = Pattern.compile(pt);
//        Matcher x = io.matcher("   h");
//        System.out.println(x.matches());
//        Pattern pat =Pattern.compile("\\s+");
//        String forpat = "qwo m";
//        Matcher bv = pat.matcher(forpat);
//        boolean bs = bv.find();
//        System.out.println(bs);
//        System.out.println(bv.end());
          String delimiter= "\\s+|\\r?\\n";
          Pattern x = Pattern.compile(delimiter);
          System.out.println(x);
    }
    
    
}
