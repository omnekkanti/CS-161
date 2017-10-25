/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

/**
 *
 * @author omprakashnekkanti
 */
public interface Queue<E> {
    
  public void enqueue(E elm);
  public E dequeue();
  public E first();
  public int size();
  public boolean isEmpty();
}
