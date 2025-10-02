import java.util.*;

public class AddTwoQueuesConcat {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(4);
        q2.add(5);
        q2.add(6);

        Queue<Integer> merged = new LinkedList<>(q1);
        merged.addAll(q2);

        System.out.println("Queue1: " + q1);
        System.out.println("Queue2: " + q2);
        System.out.println("Merged Queue: " + merged);
    }
}
