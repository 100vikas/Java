package com.Hash;
import java.util.*;

public class FirstLastKeyExample {
    public static void main(String[] args) {
        // Create a TreeMap and add some key-value pairs
       TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Joe");
        map.put(102, "Charles");
        map.put(103, "John");
        map.put(104, "George");
        map.put(105, "Smith");

        // Print the original map
        System.out.println("Original TreeMap: " + map);

        // Get the first (lowest) key
        Integer firstKey = map.firstKey();

        // Get the last (highest) key
        Integer lastKey = map.lastKey();

        // Print first and last keys
        System.out.println("First (lowest) key: " + firstKey);
        System.out.println("Last (highest) key: " + lastKey);
    }
}
