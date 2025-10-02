import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(2, "Updated Banana"); // overwrites value for key 2

        // Displaying the map
        System.out.println("HashMap: " + map);

        // Accessing a value by key
        System.out.println("Value of key 2: " + map.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Iterating over keys and values
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
