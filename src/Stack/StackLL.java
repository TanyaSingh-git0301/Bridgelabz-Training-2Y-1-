package Stack;

import java.util.Stack;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class StackLL {
    Node top= null;

    void push(int x){
        Node a=new Node(10);
        a.next=top;
        top=a;
    }

    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: "+top.data);
    }

    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        top=top.next;
    }
    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    static void main() {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
    }
}
