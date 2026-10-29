package Recursion.AdvanceProblems;
import java.util.*;

public class FindSubSequence {
    public static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(ch + ss);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> result = getSSQ("abc");
        System.out.println(result);
    }
}