/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author Om
 */
public class Client {

    public static void main(String[] args) {
//        LinkedBag<String> N  = new LinkedBag<>(); 
//     // System.out.println(N.count);
//        String x = null;
//        System.out.println(x instanceof String);
       /* ArrayBag<Player> footballTeam = new ArrayBag<>(2);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter players name:");
            String p = s.next();
            System.out.println("Enter players positionplayed:");
            String q = s.next();
            System.out.println("Enter players jerseynumber:");
            int r = s.nextInt();
            Player example = new Player(p, q, r);
            footballTeam.add(example);
        }
        footballTeam.remove();
        System.out.println(footballTeam.getCurrentSize());
        Player np = new Player("Tony", "runningback", 78);
        footballTeam.add(np);
        System.out.println(footballTeam.getCurrentSize());
        footballTeam.remove(np);
        System.out.println(footballTeam.getCurrentSize());*/

       /*LinkedBag<Player> basketBallTeam = new LinkedBag<>();
       Scanner s2 = new Scanner(System.in);
       for (int i = 0; i < 6; i++) {
       System.out.println("Enter players name:");
       String p = s2.next();
       System.out.println("Enter players positionplayed:");
       String q = s2.next();
       System.out.println("Enter players jerseynumber:");
       int r = s2.nextInt();
       Player example = new Player(p, q, r);
       basketBallTeam.add(example);
       }
       System.out.println("before remove: "+basketBallTeam.getCurrentSize());
       basketBallTeam.remove();
       System.out.println("after remove: "+basketBallTeam.getCurrentSize());
       Player np2 = new Player("Tony", "runningback", 78);
       basketBallTeam.add(np2);
       System.out.println("after adding np2: "+basketBallTeam.getCurrentSize());
       basketBallTeam.remove(np2);
       System.out.println("After removing np2: "+basketBallTeam.getCurrentSize());*/
       
       LinkedBag<String> x = new LinkedBag<>();
       x.add("om");
       x.add("prakash");
       LinkedBag<Integer> y = new LinkedBag<>();
       y.add(6);
       y.add(7);
//       boolean t = y instanceof LinkedBag;
//        System.out.println(t);
       boolean b = x.equals(y);
       System.out.println(b);
    }
}
