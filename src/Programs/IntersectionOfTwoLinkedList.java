package Programs;

import java.util.LinkedList;

public class IntersectionOfTwoLinkedList {

    static class Node
    {
        int data;
        Node next;
    };

    // Function to get the intersection point
// of the given linked lists
    static int getIntersectionNode(Node head1, Node head2)
    {
        Node curr1 = head1, curr2 = head2;

        // While both the pointers are not equal
        while (curr1 != curr2)
        {
            // If the first pointer is null then
            // set it to point to the head of
            // the second linked list
            if (curr1 == null) {
                curr1 = head2;
            }
            // Else point it to the next node
            else {
                curr1 = curr1.next;
            }

            // If the second pointer is null then
            // set it to point to the head of
            // the first linked list
            if (curr2 == null) {
                curr2 = head1;
            }
            // Else point it to the next node
            else {
                curr2 = curr2.next;
            }
        }
        // Return the intersection node
        return curr1.data;
    }

    // Driver code
    public static void main(String[] args)
    {
    /*
    Create two linked lists

    1st Linked list is 3.6.9.15.30
    2nd Linked list is 10.15.30

    15 is the intersection point
    */

        Node newNode;
        Node head1 = new Node();
        head1.data = 10;
        Node head2 = new Node();
        head2.data = 3;
        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;
        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;
        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;
        head1.next.next.next = null;

        // Print the intersection node
        System.out.print(getIntersectionNode(head1, head2));

      
    }
}


