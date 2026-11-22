package Stack;

import java.util.Stack;
public class SimpleDecreasingStack {
    static void main() {
        int arr[] = {5, 3, 4, 2, 6};
        Stack<Integer> st = new Stack<>();

        for(int num : arr){
            while(!st.isEmpty() && st.peek() < num){
                st.pop();
            }
            st.push(num);
        }
        System.out.println("Decreasing stack : "+st);
    }
}
