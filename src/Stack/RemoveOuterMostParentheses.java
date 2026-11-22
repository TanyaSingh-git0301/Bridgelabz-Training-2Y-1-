package Stack;

import java.util.Stack;
public class RemoveOuterMostParentheses {
    public static String removePar(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    static void main() {
        String s = "(()())(())";
        System.out.println(removePar(s));
    }
}
