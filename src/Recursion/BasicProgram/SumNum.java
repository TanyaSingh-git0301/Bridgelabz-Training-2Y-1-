package Recursion.BasicProgram;

import java.util.*;
public class SumNum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int small = sum(n-1);
        return small+n;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
