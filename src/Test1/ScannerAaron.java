/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author omprakashnekkanti
 */
public class ScannerAaron {
    

    public static boolean VERBOSE = true;
    
    private String source;
    private String delimiter = "\\s+";
    private Pattern pattern = Pattern.compile(delimiter);
    
    private int cursorPosition;
    
    public ScannerAaron(String source){
        this.source = source;
    }
    
    public Pattern delimiter(){
        return pattern;
    }
    
    public void useDelimiter(String delim){
        this.delimiter = delim;
        pattern = Pattern.compile(delim);
    }
    
    public void reset(){
        this.cursorPosition = 0;
    }
    
    public boolean hasNextInt(){
        if(VERBOSE) System.out.println("\n\n -- Has Next Int --");
        int oldCursor = cursorPosition; //keep track of old position for 'rollback' effect
        boolean has;    
        try{
            this.nextInt();
            has = true;
        }
        catch(Exception e){
            has = false;
        }
        cursorPosition = oldCursor;
        return has;
    }
    
    public int nextInt(){
        if(VERBOSE) System.out.println("\n\n -- Get Next Int --");
        String token = this.next();
        return Integer.parseInt(token);
    }
    
    public boolean hasNextDouble(){
        if(VERBOSE) System.out.println("\n\n -- Has Next Double --");
        int oldCursor = cursorPosition; //keep track of old position for 'rollback' effect
        boolean has;    
        try{
            this.nextDouble();
            has = true;
        }
        catch(Exception e){
            has = false;
        }
        cursorPosition = oldCursor;
        return has;
    }
    
    public double nextDouble(){
        if(VERBOSE) System.out.println("\n\n -- Get Next Double --");
        String token = this.next();
        return Double.parseDouble(token);
    }
    
    public boolean hasNext(){
        if(VERBOSE) System.out.println("\n\n -- Has Next Token --");
        int oldCursor = cursorPosition; //keep track of old position for 'rollback' effect
        boolean has;
        try{
            this.next();
            has = true;
        }
        catch(Exception e){
            has = false;
        }
        cursorPosition = oldCursor;
        return has;
    }
    
    public String next(){
        if(VERBOSE) System.out.println("\n\n -- Get Next Token --");
        //First we need to ignore leading delimiter
        //if an empty string is a part of the delimiter, then there would be a spilt 
        //between every character. i.e. dont move the cursor.
        if(pattern.matcher("").matches()){//checks if delimiter is empty string
            if(VERBOSE) System.out.printf("\"\" matches as a delimiter. No need to advance the cursor.%n");
        }
        else{
            int count = 1; //count keeps track of how many chars we are allowed to skip

            while(cursorPosition+count <= source.length() && pattern.matcher(source.substring(cursorPosition, cursorPosition+count)).matches()){
                if(VERBOSE) System.out.printf("'%s' is still a delimiter. Skip!%n", source.substring(cursorPosition, cursorPosition+count));
                count++;
            }
            
            if(cursorPosition+count <= source.length()){
                if(VERBOSE) System.out.printf("'%s' is no longer a delimiter. STOP!%n", source.substring(cursorPosition, cursorPosition+count));
            }
            else{
                if(VERBOSE) System.out.println("Reached end of string.");
            }
            
            count -= 1; //we subtract one from count because the last character we tried skipping resulted in our 'delimiter' no longer being a 'delimiter'
            
            cursorPosition += count;
        }
    
        //At this point, we know that we have skipped any necessary leading delimiter(s).
        //This means that we need to continue to read until another delimiter appears in our string
        //Note: this is the difference between matches() on line 35 and find() on 51. matches() is like 'equals' and find is like 'contains'
        
        //SANITY CHECK!
        if(cursorPosition >= source.length()-1){
            throw new NoSuchElementException("No next element");
        }
        
        int count = 1;
        while(cursorPosition+count <= source.length() && !pattern.matcher(source.substring(cursorPosition, cursorPosition+count)).find()){
            if(VERBOSE) System.out.printf("'%s' is still a token. Skip!%n", source.substring(cursorPosition, cursorPosition+count));
            count++;
        }
        
        if(cursorPosition+count <= source.length()){
            if(VERBOSE) System.out.printf("'%s' is no longer a token. STOP!%n", source.substring(cursorPosition, cursorPosition+count));
        }
        else{
            if(VERBOSE) System.out.println("Reached end of string.");
        }
        
        count -= 1; //we subtract one from count because the last character we tried skipping resulted in our 'token' no longer being a 'token'        

        String token = source.substring(cursorPosition, cursorPosition+count);
        if(VERBOSE) System.out.printf("Our token is: '%s'! yay!%n", token);
        
        //advance the cursor for next time.
        cursorPosition += count;
        
        if(VERBOSE) System.out.printf("Exit method. Cursor now at: %d%n", cursorPosition);
        return token;
    }
    
    public boolean hasNextLine(){
        if(VERBOSE) System.out.println("\n\n -- Has Next Line --");
        int oldCursor = cursorPosition; //keep track of old position for 'rollback' effect
        boolean has;
        try{
            this.nextLine();
            has = true;
        }
        catch(Exception e){
            has = false;
        }
        cursorPosition = oldCursor;
        return has;
    }
    
    public String nextLine(){
        if(VERBOSE) System.out.println("\n\n -- Get Next Line --");
        
        //SANITY CHECK!
        if(cursorPosition >= source.length()-1){
            throw new NoSuchElementException("No next line");
        }
        
        StringBuilder out = new StringBuilder();
        
        //This method reads until we find a '\n' character. seems simple.
        int count = 0;
        String currentChar = "";
        while(cursorPosition+count < source.length() && !currentChar.equals("\n")){
            out.append(currentChar);
            currentChar = source.substring(cursorPosition+count, cursorPosition+count+1);
            count++;
            if(VERBOSE) System.out.printf("String so far: '%s'%n", out.toString());
        }
        
        cursorPosition += count;
        
        return out.toString().replaceAll("[\\r\\n]+$", ""); //remove line separator at end
    }
    
    public static void main(String[] args) {
        String s = "My name is Aaron\nI am 22 years old.\r\n\r\nThis is 49.75 % fun.";
        
        ScannerAaron.VERBOSE = false;
        
        ScannerAaron myScanner = new ScannerAaron(s);
        
        System.out.printf("String: %n'%s'%n%n===============:=======%n", s);
        
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "has next", myScanner.hasNext());
        System.out.printf("%15s: '%s'%n", "has next int", myScanner.hasNextInt());
        System.out.printf("%15s: '%s'%n", "next line", myScanner.nextLine());
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "has next int", myScanner.hasNextInt());
        System.out.printf("%15s: '%s'%n", "has next dbl", myScanner.hasNextDouble());
        System.out.printf("%15s: '%s'%n", "next int", myScanner.nextInt());
        System.out.printf("%15s: '%s'%n", "next line", myScanner.nextLine());
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "has next", myScanner.hasNext());
        System.out.printf("%15s: '%s'%n", "has next line", myScanner.hasNextLine());
        System.out.printf("%15s: '%s'%n", "next", myScanner.next());
        System.out.printf("%15s: '%s'%n", "has next dbl", myScanner.hasNextDouble());
        System.out.printf("%15s: '%s'%n", "next dbl", myScanner.nextDouble());
        System.out.printf("%15s: '%s'%n", "next line", myScanner.nextLine());
        System.out.printf("%15s: '%s'%n", "has next", myScanner.hasNext());
        System.out.printf("%15s: '%s'%n", "has next int", myScanner.hasNextInt());
        System.out.printf("%15s: '%s'%n", "has next dbl", myScanner.hasNextDouble());
        System.out.printf("%15s: '%s'%n", "has next line", myScanner.hasNextLine());


    }
}

