package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // ArrayList object creation
        ArrayList<String> gundam = new ArrayList<String>();

        // add elements into the arrayList
        gundam.add("PG strike gundam");
        gundam.add("RX78 Mark II, while");
        gundam.add("PG 000 gundam");
        gundam.add("Nu metallic");

        System.out.println(gundam);

        // access the element in the arrayList, get the element only output the element not
        System.out.println(gundam.get(0));

        // replace / change the element into something.
        gundam.set(2, "red frame");
        System.out.println(gundam.get(2));

        // Remove an item
        gundam.remove(2);
        System.out.println(gundam);

        // remove all items in the list
        //gundam.clear();
        //System.out.println(gundam);

        // size of the ArrayList (this is a class so that all initials are capital)
        int size = gundam.size();
        System.out.println(size);

        // Loop through an ArrayList through for loop:
        for (int i = 0; i < gundam.size(); i++) {
            System.out.println(gundam.get(i));
        }

        // loop through for each loop:
        for (String i : gundam) {
            System.out.println(i);
        }

        // other data type are accepted in the array list;
        ArrayList<Integer> arrayNumber = new ArrayList<Integer>();
        arrayNumber.add(12);
        arrayNumber.add(23);
        arrayNumber.add(42);

        System.out.println(arrayNumber);
        for (int i : arrayNumber) {
            System.out.println(i);
        }


        // Sort an ArrayList of Strings: alphabaticly for initials
        Collections.sort(gundam);
        System.out.println(gundam);


    }
}
