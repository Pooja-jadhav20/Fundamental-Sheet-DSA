package com.Kodnest.Collection;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //  Create a PriorityQueue of integers (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //  Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.add(40);

        System.out.println("PriorityQueue: " + pq); // Internal order, not insertion order

        // Peek - see highest priority element
        System.out.println("Peek (smallest): " + pq.peek()); // 10

        // Poll - remove the highest priority element
        System.out.println("Poll: " + pq.poll()); // 10 removed

        // Remove another
        pq.remove(); // removes next priority element (20)

        // Check if it contains an element
        System.out.println("Contains 30? " + pq.contains(30)); // true or false

        // Size of queue
        System.out.println("Size: " + pq.size());

        // Is it empty?
        System.out.println("Is empty? " + pq.isEmpty());

        // Clear the queue
        pq.clear();
        System.out.println("After clearing: " + pq);
    }
}
