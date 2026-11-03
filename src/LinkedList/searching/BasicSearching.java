package LinkedList.searching;

public class BasicSearching {
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static class CustomLinkedList {
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

            public boolean search(int target) {
                Node current = head;
                while (current != null) {
                    if (current.data == target) {
                        return true;
                    }
                    current = current.next;
                }
                return false;
            }

            public void printList() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }

        public static void main(String[] args) {
            CustomLinkedList list = new CustomLinkedList();

            list.insertAtBeginning(30);
            list.insertAtBeginning(20);
            list.insertAtBeginning(10);

            System.out.print("Current List: ");
            list.printList();

            int search1 = 20;
            int search2 = 50;

        }
    }

