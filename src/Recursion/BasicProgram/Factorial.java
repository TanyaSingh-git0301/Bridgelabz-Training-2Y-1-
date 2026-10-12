package Recursion.BasicProgram;

import java.util.*;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int small = fact(n-1);
        return small*n;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
