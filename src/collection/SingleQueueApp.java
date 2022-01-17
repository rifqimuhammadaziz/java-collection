package collection;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        // Create single queue (data just one)
        Queue<String> queue = new SingleQueue<>();

        System.out.println("Queue size before add data: " + queue.size());

        System.out.println(queue.offer("Rifqi"));
        System.out.println(queue.offer("Muhammad")); // cannot be added because queue is exists (single queue)
        System.out.println(queue.offer("Aziz")); // cannot be added because queue is exists (single queue)

        System.out.println("Queue size after add data: " + queue.size());

        // retrieves data without remove
        System.out.println("Get data (not remove): " + queue.peek());

        // retrieves data and remove
        System.out.println("Get data (and remove): " + queue.poll());
        System.out.println("Get data (and remove): " + queue.poll());

        System.out.println("Queue size after get data and remove: " + queue.size());

    }
}
