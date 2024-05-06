package Programs;

import java.util.HashSet;

public class FindDuplicateInSinglyLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list with duplicates
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(3);

        findAndPrintDuplicates(head);
    }

    private static void findAndPrintDuplicates(Node head) {
        // HashSet to store encountered elements
        HashSet<Integer> set = new HashSet<>();

        // Pointers for iterating through the linked list
        Node current = head;
      //  Node previous = null;

        // Iterate through the linked list
        while (current != null) {
            int data = current.data;

            // Check if the element is already in the set
            if (set.contains(data)) {
                // If the element is already in the set, it's a duplicate
                System.out.println("Duplicate Element: " + data);
            } else {
                // Add the element to the set
                set.add(data);
            }

            // Move to the next node
          //  previous = current;
            current = current.next;
        }
    }
}

