package com.Kodnest.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithAllMethods {
    public static void main(String[] args) {
    	// FIFO
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        //  Add elements to the queue
        queue.add(10);   // throws exception if fails
        queue.offer(20); // returns false if fails
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue after additions: " + queue); // [10, 20, 30, 40]

        // Peek at the front element
        System.out.println("Peek (front element): " + queue.peek()); // 10

        // Remove the front element
        System.out.println("Poll (remove front): " + queue.poll()); // removes 10

        // Remove again using remove() method
        System.out.println("Remove: " + queue.remove()); // removes 20

        System.out.println("Queue after removals: " + queue); // [30, 40]

        //  Size of queue
        System.out.println("Size of queue: " + queue.size()); // 2

        //  Check if queue contains a value
        System.out.println("Contains 30? " + queue.contains(30)); // true
        System.out.println("Contains 100? " + queue.contains(100)); // false

        //  Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        //  Clear the queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue); // []
        System.out.println("Is queue empty now? " + queue.isEmpty()); // true
    }
}
