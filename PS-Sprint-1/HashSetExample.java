package com.Kodnest.Collection;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //  Create a HashSet
        Set<String> names = new HashSet<>();

        //  Add elements
        names.add("Pooja");
        names.add("John");
        names.add("Alex");
        names.add("Pooja"); // Duplicate - ignored

        System.out.println("HashSet: " + names); // No order guaranteed

        //  Check size
        System.out.println("Size: " + names.size());

        //  Check if contains an element
        System.out.println("Contains 'John'? " + names.contains("John"));

        // Remove element
        names.remove("Alex");

        //  Iterate using for-each
        for (String name : names) {
            System.out.println(name);
        }

        //  Convert to list (optional)
        List<String> nameList = new ArrayList<>(names);
        System.out.println("List from Set: " + nameList);

        //  Clear the set
        names.clear();
        System.out.println("Is empty? " + names.isEmpty());
    }
}
