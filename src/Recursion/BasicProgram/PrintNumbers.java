package Recursion.BasicProgram;

import java.util.*;
public class PrintNumbers {
    public static void printInc(int n){

        if(n==1){
            System.out.print(n+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
    }
}
