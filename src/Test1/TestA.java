
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author omprakashnekkanti
 */
public class TestA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     
         
          
         String om = JOptionPane.showInputDialog(null, "Enter an Integer");
          try{
              int y = Integer.parseInt(om);    
          }
          catch(Exception e){
//              System.out.println("Output from getMessage");
              System.out.println(e.getMessage());/*exception class inherits 3 members from throwable class(1 attribute,2 methods)
              1) String detailMessage; 2)getMessage():String method which returns the detailMessage attribute*/
//              System.out.println("End of Output from getMessage");
//              System.out.println("Output from toString");
              System.out.println(e.toString());
//              it writes the class name first using getclass().getname() + : + attributes of the class, here attribute is coming from throwable, detailed message 
//              System.out.println("End of Output from toString");
//              System.out.println("Output from PrintStackTrace");
              e.printStackTrace();
//             This method comes from throwable class. it calls printStackTrace(PrintStream p) which inturn prints the array of stackTraceElement objects that 
//             have information about filename/class name, methodname, line number. They are actually the attributes in the StackTraceElement class
//             This method shows the sequence of jumps by control flow. these jumps in code leave the trace of stacks in memory.
//              System.out.println("End of Output from PrintStackTrace");
              
//              System.out.println("wrapping exception object");
//              throw new IllegalArgumentException("new exception", e);
              
          }
//          finally{
//               logger.error("Unable to sleep!", e);
//          }
    }

}
