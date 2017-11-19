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
public interface List<P> {
    public int getSize();
    public boolean isEmpty();
    public P get(int i) throws IndexOutOfBoundsException;
    public P set(int i, P e)throws IndexOutOfBoundsException;
    public void add(int i,P e) throws IndexOutOfBoundsException;//having braces {} means methods has an empty body
    public P remove(int i) throws IndexOutOfBoundsException;
}
