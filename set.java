import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate, ignored

        System.out.println("Set: " + fruits); 
    }
}
