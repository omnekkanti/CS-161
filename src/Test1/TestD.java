/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author omprakashnekkanti
 */
public class TestD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Aclass x = new Aclass();
          System.out.println(x.getId());
          System.out.println(x.getName());//wont work properly if you use void infront of constructor. it intialzes instance variables to defaults.
    }
    
}
