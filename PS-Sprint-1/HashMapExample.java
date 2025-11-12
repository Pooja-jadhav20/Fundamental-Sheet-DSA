package com.Kodnest.Collection;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        //  Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        //  Put key-value pairs
        map.put("Name", "Pooja");
        map.put("City", "Pune");
        map.put("Role", "Developer");

        //  Print the map
        System.out.println("HashMap: " + map);

        // Get value by key
        System.out.println("City: " + map.get("City"));

        //  Update value
        map.put("City", "Mumbai");

        //  Remove entry
        map.remove("Role");

        //  Check if a key exists
        System.out.println("Has 'Name'? " + map.containsKey("Name"));

        //  Check if a value exists
        System.out.println("Has value 'Mumbai'? " + map.containsValue("Mumbai"));

        //  Iterate using keySet
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        //  Iterate using entrySet
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //  Map size
        System.out.println("Size: " + map.size());

        //  Check if empty
        System.out.println("Is empty? " + map.isEmpty());

        //  Clear map
        map.clear();
        System.out.println("After clear: " + map);
    }
}
