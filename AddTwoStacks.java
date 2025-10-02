import java.util.*;

public class AddTwoStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        // Create a new stack for merged result
        Stack<Integer> merged = new Stack<>();
        merged.addAll(stack1);
        merged.addAll(stack2);

        System.out.println("Stack1: " + stack1);
        System.out.println("Stack2: " + stack2);
        System.out.println("Merged Stack: " + merged);
    }
}
