package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // create a HashMap<> and put key / value pairs in the HashMap;
        HashMap<String, String> videoCards = new HashMap<String, String>();

        videoCards.put("nvidia", "RTX series");
        videoCards.put("AMD", "5700x");
        videoCards.put("Intel", "HD6500");

        System.out.println(videoCards);

        // to access a value, you must know the key!

        System.out.println(videoCards.get("nvidia"));

        // to remove the item:
        //videoCards.remove("AMD");
        //System.out.println(videoCards);

        // clear all item:
        //videoCards.clear();
        //System.out.println(videoCards);

        // get the HashMap size: return an integer;
        int size = videoCards.size();
        System.out.println(size);

        // loop the HashMap with for each: either keySet() or values(); return key or values string value.
        for (String keys : videoCards.keySet()) {
            System.out.println(keys);
        }
        for (String values : videoCards.values()) {
            System.out.println(values);
        }
        for (String str : videoCards.keySet()) {
            System.out.println("Key: " + str + "; Value: " + videoCards.get(str) + ".");
        }

        //key and values are all objects. If we want to use HashMap to store other types other than String, we need to
        //use the wrapper class of the primitive data types for example: int--- Integer; byte----Byte; short----Short;
        //long----Long; float-----Float; double-----Double; boolean----Boolean; char-----Character;***

        HashMap<String, Double> videoCardsPrice = new HashMap<String, Double>();
        videoCardsPrice.put("RTX 2070", 550.99);
        videoCardsPrice.put("RTX 2070 super", 499.99);
        videoCardsPrice.put("RTX 2080", 650.99);

        for (String key : videoCardsPrice.keySet()) {
            System.out.println("The price of " + key + " is " + videoCardsPrice.get(key) + ".");
        }






    }
}
