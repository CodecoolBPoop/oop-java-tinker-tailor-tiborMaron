package com.codecool.tinkertailor;

import com.codecool.circularlist.CircularList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        CircularList test = new CircularList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add("valami");
        Iterator iterator = test.iterator();
        int i = 0;
        while (i < 15) {
            System.out.println(iterator.next());
            i++;
        }
    }
}
