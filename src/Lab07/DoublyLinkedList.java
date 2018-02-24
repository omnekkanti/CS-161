/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07;

/**
 *
 * @author omprakashnekkanti
 */
public interface DoublyLinkedList<U> {
    
   public U first();
   public U last();
   public void addFirst(U elm);
   public void addLast(U elm);    
   public U removeLast();    
   public U removeFirst(); 
   public int size();
   public boolean isEmpty();
}
