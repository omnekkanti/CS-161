/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author omprakashnekkanti
 */
public class OmTestScanner {

    int cursorPosition;
    String delimiter= "\\s+|(\\r?\\n)";
    Pattern x = Pattern.compile(delimiter);
    String athand;
    
    public OmTestScanner(String input){
        athand = input;
    }
    
    public void setDelimiter(String input){
        delimiter = input;
        x= Pattern.compile(delimiter);
    }

    @Override
    public String toString() {
        return "OmTestScanner{" + "cursorPosition=" + cursorPosition + ", delimiter=" + delimiter + ", x=" + x.toString() + ", athand=" + athand + '}';
    }
    
    public String next(){
//    if(x.equals(Pattern.compile("")))
    int count=1;
    String returnString="";// null or empty string no difference
    if(x.matcher("").matches())
    { System.out.println("delimiter is an empty string " );
    
    if(cursorPosition<athand.length()){
         returnString = athand.substring(cursorPosition,cursorPosition+1);
    }
    else{
    throw new IllegalStateException(  "cursor is at the boundary of"+athand);
    }
        cursorPosition++;
        return returnString;
    }
    
    else{
        int oldcursor=cursorPosition;
        while(cursorPosition<athand.length()&&!x.matcher(athand.substring(cursorPosition,cursorPosition+count)).matches()){
            cursorPosition +=1;
           
        }
        try{
        returnString = athand.substring(oldcursor, cursorPosition);
        }
        catch(Exception e)
        { System.out.println(e.getMessage());
        }
        cursorPosition +=1;
        if(!x.matcher(returnString).find() && !returnString.equals("")){
        return returnString;}
        return null;
        }
    
    
    
    }
    
    public String nextLine(){
        StringBuilder out = new StringBuilder();
        String currentchar="";
        while(cursorPosition<athand.length()&& !currentchar.equals("\n") )
        {   
            out.append(currentchar);
            currentchar= athand.substring(cursorPosition, cursorPosition+1);
            cursorPosition++;
        }
        return out.toString();
    }
    
    
    
    public String nextLine2(){
        
        
        //SANITY CHECK!
        if(cursorPosition >= athand.length()-1){
            throw new NoSuchElementException("No next line");
        }
        
        StringBuilder out = new StringBuilder();
        
        //This method reads until we find a '\n' character. seems simple.
        int count = 0;
        String currentChar = "";
        while(cursorPosition+count < athand.length() && !currentChar.equals("\n")){
            out.append(currentChar);
            currentChar = athand.substring(cursorPosition+count, cursorPosition+count+1);
            count++;
        }
        
        cursorPosition += count;
        
        String eString= out.toString(); //remove line separator at end
        return eString;
}
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String testString="  yw";
//        OmTestScanner x = new OmTestScanner("  yw");
        String testString="Aron\nd.\r\n\r\nThis is 49.75 % fun.\r\n";//6chars
        OmTestScanner x = new OmTestScanner(testString);
        System.out.println(x);
        System.out.println(x.nextLine2());
        System.out.println(x.nextLine2());
        System.out.println(x.nextLine2());
        System.out.println(x.nextLine2());
//        x.setDelimiter("");
//        System.out.println(x);
//        for(int i =0; i<testString.length(); i++){
//            System.out.println("token: "+ "'"+x.next()+"'");
//        }
      
    }
    
}
