package Stack;

import java.io.CharConversionException;
import java.util.Stack;
public class BackspaceString {
    public static boolean backspace(String s, String t){
        Stack<Character> st1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='#'){
                st1.push(ch);
            }
            else if(!st1.isEmpty()){
                st1.pop();
            }
        }
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch!='#'){
                st2.push(ch);
            }
            else if(!st2.isEmpty()){
                st2.pop();
            }
        }
        return st1.equals(st2);
    }

    static void main() {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspace(s,t));
    }
}
