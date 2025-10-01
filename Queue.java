import java.util.*;

public class Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.poll()); // removes first element
        System.out.println("Queue after poll: " + queue);
    }
}
