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
public class Aclass {
    int id=97;
    String name="default";
    
//    public void Aclass(){// gives defaults to attributes as keyword void is present
//    id=10;
//    name="Om";
//    }
    
    
    public Aclass(){
//    id=11;
//    name="Omp";
    System.out.println("Constructor block executed");
    }
    
    {
    id = 67;
    name = "zoro";
    System.out.println("instance block executes ater instantiation, execution of super() constructor in constructor block");
    System.out.println("instance block executed");
//when there is no code in constructor this block takes effect over variable assignments during 
//    class definition. as the order of execution is instantiation, intialization according to class definition, super() in constructor block, instance block code, rest of the constructor body 
    }
    {
        id = 95;
        name = "Aaron";
    }
//   If there are multiple instance blocks in class definition they are executed in the order they are after super() call in constructor.
//    what is an anonymous array
    
    public int getId(){return id;}
    public String getName(){return name;}
}
