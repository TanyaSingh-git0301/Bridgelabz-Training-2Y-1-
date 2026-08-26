package com.Arrays.Logical_Problems;

import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int num){
       if(num<=0){
           return false;
       }
       for(int i=2;i<num;i++){
           if(num % i==0){
               return false;
           }
       }
       return true;
    }

    public static void printPrime(int [] arr){
        System.out.println("Prime numbers are : ");

        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printPrime(arr);
    }

}
