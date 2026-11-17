package Stack;

public class Main {
    static void main() {
        StackOps2 st=new StackOps2();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();

        System.out.println();
        st.pop();
        st.display();

        System.out.println();
        st.peek();
        st.display();
    }
}