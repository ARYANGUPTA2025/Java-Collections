import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("LinkedList: " + list);

        // Adding at specific index
        list.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + list);

        // Removing element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Access element
        System.out.println("Element at index 1: " + list.get(1));
    }
}
