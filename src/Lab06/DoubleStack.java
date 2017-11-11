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
public interface DoubleStack<E> {
    public void redPush(E e);
    public E redPop();
    public E redTop();
    public int redSize();
    public boolean redIsEmpty(); 
   
    public void bluePush(E e);
    public E bluePop();
    public E blueTop();
    public int blueSize();
    public boolean blueIsEmpty();
}
