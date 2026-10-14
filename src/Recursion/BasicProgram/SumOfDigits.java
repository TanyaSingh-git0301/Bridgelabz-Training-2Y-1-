package Recursion.BasicProgram;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int small = n%10;
        int small1 = sum(n/10);
        return small+small1;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

}
