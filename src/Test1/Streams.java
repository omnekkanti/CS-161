/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;


/**
 *
 * @author omprakashnekkanti
 */
public class Streams {
    
    public static void main(String[] args) throws IOException {
        int r;
        
        /*r= System.in.read();// read method stops the execution and it flows again once user hits enter after input or just enter.
        //        enter puts the input along with lf in the buffer
        System.out.println(r);*/
         String x = "";
//      This code is similar to readLine method in datastream class. Filter streams like datastream provide some abstraction like this.It is used to read primitive data types
// meaning reading 4 bytes for int datatype. 
        while((r=System.in.read())!=10)
        {
            char c =(char)r;    
            x = x + c;       
        }
        System.out.println(x);
        
//        DataInputStream pipe = new DataInputStream(System.in);
//        String inputLine = pipe.readLine();//readLine has the above code.this method can read 0 to 256 characters only 
//        int ag = Integer.parseInt(inputLine);
//        System.out.println(ag);
//        
//        DataInputStream pipe3 = new DataInputStream(new File("/Users/omprakashnekkanti/Desktop/Fall2017-CS161/Java-161/Homeworks/H-2/JavaLibrary1/JavaLibrary1/src/Lab04/SourceForNumbers.txt"));
//        
//        BufferedReader pipe4 = new BufferedReader(new FileReader("/Users/omprakashnekkanti/Desktop/Fall2017-CS161/Java-161/Homeworks/H-2/JavaLibrary1/JavaLibrary1/src/Lab04/SourceForNumbers.txt"));
//        BufferedReader pipe2 = new BufferedReader(new InputStreamReader(System.in));
//        String inputLine2 = pipe2.readLine();//this method can read 0 to 65,535 characters 
//        int ag2 = Integer.parseInt(inputLine2);
//        System.out.println(ag2);
// InputStreamReader has only attribute(of type StreamDecoder). It uses adapter pattern where the methods of streamdecoder does the job when Object of InputStreamReader is created using the object of inputstream as an arguemnt.  
//   It creates an object of streamdecoder using static method in that class in the constructor body of InputStreamReader
// read() method on InputStreamReader object calls read() method on its only attribute of type streamdecoder. This is adapter pattern

// FileInputStream and FileReader are useful classes for reading from image files and character files 
    }
    
}
