/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author omprakashnekkanti
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticDoubleStackSingleArray<Integer> DS1 = new StaticDoubleStackSingleArray<>(8);
        StaticDoubleStackSingleArray2<Integer> DS2 = new StaticDoubleStackSingleArray2<>(8);
        StaticLeakyStack<Integer> DS3 = new StaticLeakyStack<>(4);
                
        for (int i = 5; i < 9; i++) {
            DS1.bluePush(i);
            DS2.bluePush(i);
            DS1.redPush(i);
            DS2.redPush(i);
            DS3.Push(i);
        }
        
        System.out.println("DS1 elements: ");
        System.out.println("Blue: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(DS1.bluePop());
        }
        System.out.println("Red: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(DS1.redPop());
        }
        System.out.println("\n\nDS2 elements: ");
        System.out.println("Blue: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(DS2.bluePop());
        }
        System.out.println("Red: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(DS2.redPop());
        }
        for (int i = 9; i < 11; i++) {
            DS3.Push(i);
        }
        System.out.println("DS3 elements: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(DS3.Pop());
        }
        
    }
}
