package com.Kodnest.Collection;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();

        //  Add elements
        list.add(1); // add at end
        list.add(2);
        list.add(3);
        list.add(4);

        //  Add at a specific index
        list.add(0, 10); // inserts 10 at index 0

        //  Add at the beginning and end
        list.addFirst(99);
        list.addLast(100);

        //  Display the list
        System.out.println("Initial List: " + list);

        //  Remove by index
        list.remove(0); // removes 99

        //  Remove by value
        list.remove(Integer.valueOf(3)); // removes 3

        //  Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        //  Modify an element
        list.set(1, 500); // replaces element at index 1 with 500

        //  Check if element exists
        System.out.println("Contains 2? " + list.contains(2));

        //  Size of list
        System.out.println("Size: " + list.size());

        //  Loop through the list
        System.out.print("Using for-each loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        //  Clear the list
        list.clear();
        System.out.println("\nList after clear(): " + list);
    }
}
