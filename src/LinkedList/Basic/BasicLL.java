package LinkedList.Basic;

import java.sql.SQLOutput;

public class BasicLL {
    static void main() {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println("Trick - 1 with sout");
        System.out.print(a.data +" -> ");
        System.out.print(b.data +" -> ");
        System.out.print(c.data +" -> ");
        System.out.print(d.data +" -> ");
        System.out.print(e.data);
        System.out.println();


        System.out.println("Trick - 2 with sout and next keyword");
        System.out.print(a.data +" -> ");
        System.out.print(a.next.data +" -> ");
        System.out.print(a.next.next.data +" -> ");
        System.out.print(a.next.next.next.data +" -> ");
        System.out.print(a.next.next.next.next.data);
        System.out.println();


        System.out.println("Trick - 3 with for loop");
        Node temp1 = a;
        for(int i=0;i<5;i++){
            System.out.print(temp1.data +" -> ");
            temp1=temp1.next;
        }
        System.out.println();


        System.out.println("Trick - 4 with while loop");
        Node temp2=a;
        while(temp2!=null){
            System.out.print(temp2.data +" -> ");
            temp2=temp2.next;
        }
        System.out.println();


        System.out.println("Trick - 5 with method");
        display(a);
        System.out.println();


        System.out.println("Trick - 6 with recursive call");
        recursiveCall(a);
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data +" -> ");
            head= head.next;
        }
    }

    public static void recursiveCall(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data +" -> ");
        recursiveCall(head.next);
    }
}
