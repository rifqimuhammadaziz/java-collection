import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        // STACK
        Deque<String> stack = new LinkedList<>();

        // add data to First
        stack.offerFirst("1Rifqi");
        stack.offerFirst("2Muhammad");
        stack.offerFirst("3Aziz");

        for (var value : stack) {
            System.out.println(value);
        }

        System.out.println("Last stack is : " + stack.pollLast());

        // QUEUE
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("1Xenosty");
        queue.offerLast("2Theord");
        System.out.println(queue.pollFirst());
    }
}
