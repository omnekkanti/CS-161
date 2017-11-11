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
public interface LeakyStack<L> {
    
    public void Push(L e);
    public L Pop();
    public L Top();
    public int Size();
    public boolean IsEmpty();
    
}
