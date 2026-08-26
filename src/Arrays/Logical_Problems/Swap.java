package com.Arrays.Logical_Problems;

import java.util.Scanner;
public class Swap {
    public static int[] swap(int a, int b){
        int arr[] = {1,2,3,4,5,6,7};
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        return arr;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans[] = swap(a, b);
        for(int i=0; i<ans.length ;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
