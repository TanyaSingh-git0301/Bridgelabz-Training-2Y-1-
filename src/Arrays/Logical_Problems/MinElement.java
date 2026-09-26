package Arrays.Logical_Problems;

import java.util.Scanner;
public class MinElement {
    public static int min(int [] arr){
        int minVal = arr[0];
        for(int i=0;i<arr.length; i++){
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int val = min(arr);
        System.out.println("Minimum value : "+val);
    }
}
