package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        /**
         * Queue
         * Like an ArrayList, if numElements out of capacity, size will grow (even declare the numElements)
         */

        Queue<String> queue = new ArrayDeque<>(10);
        // Queue<String> queue = new LinkedList<>(10);
        for (int i = 0; i < 20; i++) {
            queue.add(String.valueOf(i));
        }
        queue.add("Rifqi");
        queue.add("Muhammad");
        queue.add("Aziz");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        // Size is 0, poll is get data in head and remove it
        System.out.println(queue.size());

        System.out.println("PRIORITY QUEUE");
        // Ordered Queue
        Queue<String> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.add("Rifqi");
        priorityQueue.add("Muhammad");
        priorityQueue.add("Aziz");
        System.out.println(priorityQueue);
    }
}
