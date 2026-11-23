package Stack;

public class StackOps2 {
    int arr[] = new int[5];
    int top = -1;
    public void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = data;
    }

    public void pop(){

        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("pop element: "+arr[top]);
        top--;
    }

    public void peek(){
        if(top==-1){
            System.out.println("Stack full");
            return;
        }
        System.out.println("Peek element: "+arr[top]);
    }

    public void display(){
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}