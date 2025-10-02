class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class AddTwoNumbersLinkedList {

    // Function to add two linked lists
    static Node addLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new Node(carry);
        }

        return dummy.next;
    }

    // Utility to print linked list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Number 123 as 3->2->1
        Node l1 = new Node(3);
        l1.next = new Node(2);
        l1.next.next = new Node(1);

        // Number 49335 as 5->3->3->9->4
        Node l2 = new Node(5);
        l2.next = new Node(3);
        l2.next.next = new Node(3);
        l2.next.next.next = new Node(9);
        l2.next.next.next.next = new Node(4);

        Node result = addLists(l1, l2);

        System.out.print("Result: ");
        printList(result);  // should print 8 -> 5 -> 6 -> 9 -> 4
    }
}
