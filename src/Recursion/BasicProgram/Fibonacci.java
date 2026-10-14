package Recursion.BasicProgram;

import java.util.*;
public class Fibonacci {
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        int small1=fibo(n-1);
        int small2=fibo(n-2);
        return small1+small2;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
}
