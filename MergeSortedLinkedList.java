import java.util.*;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6));

        LinkedList<Integer> merged = new LinkedList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }
        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        System.out.println("Merged Sorted LinkedList: " + merged);
    }
}
