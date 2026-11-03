package LinkedList.searching;

public class linkedlist {

    public class Node {
        int data;
        Node next; // Fixed here

        public Node(int data) {
            this.data = data;
        }
    }

    public class CustomLinkedList {
        Node head;

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
    }
}
