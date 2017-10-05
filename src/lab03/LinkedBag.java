/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Random;

/**
 *
 * @author Om
 */
public class LinkedBag<P> implements Bag<P> {

    private SinglyLinkedList<P> list;
    private int count;

    @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return (count != 0);
// return (!list.isEmpty());
    }

    public LinkedBag() {
        list = new SinglyLinkedList<P>();
        count = list.getSize();
    }

    @Override
    public boolean add(P num) {
        list.addFirst(num);
        count++;
        return true;
    }

    @Override
    public boolean remove(P num) {
        boolean b = list.remove(num);
        if (b) {
            count--;
        }
        return b;
    }

    @Override
    public P remove() {
        if (count == 0) {
            throw new IllegalStateException("there are no items in the bag");
        }
        int itemno = new Random().nextInt(count);
        P item = list.remove(itemno);
        if (item != null) {
            count--;
        }
        return item;
    }

    @Override
    public void clear() {
        list = new SinglyLinkedList<>();
        count = list.getSize();
    }

    @Override
    public int getFrequencyOf(P num) {
        return list.getFreq(num);
    }

    @Override
    public boolean contains(P num) {
        return list.Contains(num);
    }

    public String toString() {
        String returnString = getClass().getName() + ": ";

        returnString += list.toString();
        return returnString;
    }

    public boolean equals(Object o) {

        if (!(o instanceof LinkedBag)) {
            return false;
        }

        LinkedBag l = (LinkedBag) o;

        if (l.count == this.count) {
           return this.list.equals(l.list);
        }
        return false;
    }

}
