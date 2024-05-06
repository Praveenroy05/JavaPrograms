package Programs;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        // Function to find the middle of the linked list
        void findMiddle() {
            if (head == null) {
                System.out.println("Linked list is empty");
                return;
            }

            Node slowPointer = head;
            Node fastPointer = head;

            while (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }

            System.out.println("Middle of the linked list: " + slowPointer.data);
        }

        // Function to insert a new node at the end of the linked list
        void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Function to display the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();
            linkedList.insert(1);
            linkedList.insert(2);
            linkedList.insert(3);
            linkedList.insert(4);
            linkedList.insert(5);

            System.out.println("Linked List:");
            linkedList.display();

            linkedList.findMiddle();
        }
    }


