/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Om
 */
public interface Bag<P>{
    int getCurrentSize( );
    boolean isEmpty( );
    boolean isFull( );
    boolean add (P num);
    boolean remove (P num);
    P remove( );
    void clear( );
    int getFrequencyOf(P num); 
    boolean contains(P num);
    String toString( );
    boolean equals(Object o);
}
