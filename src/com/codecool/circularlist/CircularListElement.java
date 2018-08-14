package com.codecool.circularlist;

class CircularListElement<type> {
    private type data;
    private CircularListElement<type> next;

    CircularListElement(type data) {
        this.data = data;
        this.next = null;
    }

    type getData() {
        return data;
    }

    CircularListElement<type> getNext() {
        return next;
    }

    void setData(type data) {
        this.data = data;
    }

    void setNext(CircularListElement<type> next) {
        this.next = next;
    }

    public String toString() {
        return getData().toString();
    }

}