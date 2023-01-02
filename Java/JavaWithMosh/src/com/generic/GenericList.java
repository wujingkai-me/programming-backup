package com.generic;

import java.util.Iterator;

// public class GenericList<T extends Number & Comparable> {
public class GenericList<T> implements Iterable<T>{

    // boolean containAll (GenericList<?> c);
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;

    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
        // return null;
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index = 0;
        public ListIterator( GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
        
    }
}
