/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.util.Scanner;
import static java.lang.System.*;
/**
 *
 * @author omprakashnekkanti
 */

class X {
char fido;
}
class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        X fido = new X();
	System.out.print(fido.fido);
	Scanner x = new Scanner(in);
        int eno;
        float sal;
        boolean rumanager;
        String name;
        
        System.out.println("Enter eno");
        eno=x.nextInt();
//        System.out.println("read"+eno);
//        eno=x.nextInt();
        System.out.println("read employee number: "+ eno);
        System.out.println("Enter Salary");
        sal = x.nextFloat();
        System.out.println("read Salary: "+ sal);
        System.out.println("Enter Name");
        name=x.nextLine();
        System.out.println("Read Name: "+name);

//        x.useDelimiter(",");
//        String thing = x.next();
//        String name = x.nextLine();
//        System.out.println(thing);
//        System.out.println(name);
        
        
    }
    
}
