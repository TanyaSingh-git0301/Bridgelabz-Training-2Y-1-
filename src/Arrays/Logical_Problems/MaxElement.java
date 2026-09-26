package Arrays.Logical_Problems;

import java.util.Scanner;
public class MaxElement {
    public static int max(int arr[]){
        int maxVal = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[10];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int val = max(arr);
        System.out.println("Maximum value : "+val);
    }
}
