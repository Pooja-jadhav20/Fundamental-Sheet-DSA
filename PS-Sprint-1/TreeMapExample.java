package com.Kodnest.Collection;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        //  Create TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        //  Add key-value pairs
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(5, "Cherry");
        map.put(2, "Mango");

        System.out.println("TreeMap (Sorted): " + map);

        //  Get value by key
        System.out.println("Value for key 2: " + map.get(2));

        //  Check if key/value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));

        //  Remove a key
        map.remove(5);

        //  Iterate using entrySet
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //  First and Last Key
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        //  Floor and Ceiling
        System.out.println("Floor Key of 4: " + map.floorKey(4));   // greatest <= 4
        System.out.println("Ceiling Key of 4: " + map.ceilingKey(4)); // smallest >= 4

        //  Clear map
        map.clear();
        System.out.println("After clear: " + map);
    }
}
