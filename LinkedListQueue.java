import java.util.*;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Queue: " + queue);

        // FIFO removal
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
