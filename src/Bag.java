/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omprakash.nekkanti
 */
public interface Bag {
    int getCurrentSize( );
    boolean isEmpty( );
    void add (int num);
    void remove (int num);
    void  remove( );
    void clear( );
    int getFrequencyOf(int num); 
    boolean contains(int num);
    String toString( );
    boolean equals(Object o);

}
