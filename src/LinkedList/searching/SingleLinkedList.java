package LinkedList.searching;

import LinkedList.Basic.Node;

public class SingleLinkedList {
    public static Node head;
    public static Node tail;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static void InsertAtStart(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void InsertAtEnd(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next=newNode;
        tail = newNode;
    }


    public static Node findMid(){
        if(head==null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void deleteFirst(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        head=head.next;

    }

    public static void deleteLast(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    
    public static void display(){
        if(head==null){
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    static void main() {
        InsertAtEnd(2);
        InsertAtEnd(4);
        InsertAtStart(6);
        InsertAtEnd(8);

        InsertAtStart(2);
        InsertAtStart(4);
        InsertAtStart(6);
        InsertAtStart(8);

        System.out.print("Our list : " );
        display();
    }
}
