
import static java.lang.System.*;



public class Client {
    
    public static void main(String[] args) {
     
//          int [] c = new int[9];
//            c[0]=9;
//            c[1]=10;
//            
//           for(int i=0;i<9;i++)
//           {
//                System.out.println(c[i]);
//           }
//         out.println("No of spots: "+ c.length);
    
         
         Scores s = new Scores(100);
         Scores s2 = new Scores(1);
//         System.out.println(s.isEmpty());
//         System.out.println(s.contains(0));
//         s.add(0);
//         System.out.println(s.isEmpty());
//         System.out.println(s.contains(0));
         
         s.add(50);
         for(int i=0;i<99;i++)
         {
             s.add(new java.util.Random().nextInt(201)-100);
         }    
         
         s2.add(50);
         
         System.out.println("Equals? : " + s2.equals(s));
         System.out.println("Equals? : " + s.equals(s2));
//        
        System.out.println(s.toString());
        
        s.add(86);
        
        System.out.println("Length after adding 86 to the bag: " + s.getCurrentSize());
        s.remove();
        int seventyFifth = s.get(75);
        System.out.println("element at 75th: " + seventyFifth);
        int freq = s.getFrequencyOf(seventyFifth);
        System.out.println("frequency of number at 75th index in the bag: " + freq);
        s.remove(seventyFifth);
        int newFreq = s.getFrequencyOf(seventyFifth);
        System.out.println("frequency of the nymber at 75th after removal of first occurance: "+ newFreq);
        int eightySixF = s.getFrequencyOf(86);
        System.out.println("frequency of the number 86: " + eightySixF);
        System.out.println("number 86 is available in the bag: " + s.contains(86));
    }
  
}
