package com.codecool.circularlist;

import java.util.*;

public class CircularList<type> implements List {
    private int size;
    private CircularListElement<type> head;
    private CircularListElement<type> tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
        // TODO
    }

    @Override
    public Iterator iterator() {
        return new CircularListIterator(head);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
        // TODO
    }

    @Override
    public boolean add(Object o) {
        CircularListElement<type> newElement = new CircularListElement<>((type) o);
        newElement.setNext(head);

        if (isEmpty()) {
            head = tail = newElement;
        } else {
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
        // TODO
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
        // TODO
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
        // TODO
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        return null;
        // TODO
    }

    @Override
    public Object set(int index, Object element) {
        return null;
        // TODO
    }

    @Override
    public void add(int index, Object element) {
        // TODO
    }

    @Override
    public Object remove(int index) {
        return null;
        // TODO
    }

    @Override
    public int indexOf(Object o) {
        return 0;
        // TODO
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
        // TODO
    }

    @Override
    public ListIterator listIterator() {
        return null;
        // TODO
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
        // TODO
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
        // TODO
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
        // TODO
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
        // TODO
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
        // TODO
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class CircularListIterator implements Iterator {
        CircularListElement<type> head;
        CircularListElement<type> current;
        int currentPos;

        CircularListIterator(CircularListElement<type> head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return size > 0;
        }

        @Override
        public Object next() {
            if (!(hasNext())) throw new NoSuchElementException("List is empty!");

            if (currentPos == 0) current = head;
            else current = current.getNext();

            currentPos++;
            return current;
        }
    }
}