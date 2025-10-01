import java.util.*;

public class Deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.add("Middle");

        System.out.println("Deque: " + deque);

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Deque after removal: " + deque);
    }
}
