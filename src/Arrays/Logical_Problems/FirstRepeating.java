package com.Arrays.Logical_Problems;

import java.util.Scanner;
public class FirstRepeating {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int firstRepeat(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(firstRepeat(arr));
    }
}
