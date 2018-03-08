/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omprakashnekkanti
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//         int cvb[] = {1,2,3};
//        System.out.println(cvb.toString());
//        
//        Pattern pi = Pattern.compile("\\s+");
//        System.out.println(pi);
//        System.out.println(pi.pattern());
//        Matcher m = pi.matcher("om prakash");
//        System.out.println(m.pattern());
//        System.out.println(m.pattern().pattern());
//        Matcher m2 = pi.matcher("om prakash nekkanti");
//        String psyche = "om";
//        System.out.println(psyche.substring(0, 1));
//        boolean b = m.matches();
//        boolean b2 = m2.find();
        
        String yu = " , , ,  ";// trailing empty stringS-plural are not loaded into array
        String yu1 = "   ";
        String yu2 = ",,,";
         
        for(String st:yu.split(" ")){
        System.out.println("String token:"+"'"+st+"'"+ "is this string empty: "+st.isEmpty());
        }
        
        /*for(String st:yu2.split("")){
        System.out.println("String token:"+"'"+st+"'"+ "is this string empty: "+st.isEmpty());
        }*/
        
        Pattern bi = Pattern.compile(" ");
        bi.matcher(yu).matches();
        
    }
    
}
