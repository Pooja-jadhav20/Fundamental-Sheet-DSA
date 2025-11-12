package com.Kodnest.Collection;

import java.util.ArrayList; // Importing the correct ArrayList class from java.util

public class ArrayListExample {

    public static void main(String[] args) {
    	
    	// it can take O(N) time complexity
        // Creating an ArrayList of Strings
        ArrayList<String> people = new ArrayList<>();

        // Adding elements
        people.add("pooja");
        people.add("john");
        people.add("dave");
        people.add("mani");
        people.add("seema");

        // Removing by value
        people.remove("pooja");

        // Removing by index
        people.remove(1); // This will remove "dave" (since "pooja" was already removed)

        // Printing remaining elements
        System.out.println("People List: " + people);
        
        //
        if(people.contains("john")) {
        	System.out.println("john is in the list");
        }
        if(people.isEmpty()) {
        	System.out.println("the list is empty");
        }
        people.clear();
    }
}


