package Arrays.Logical_Problems;

import java.util.Scanner;
public class Reverse {
    public static void reverse(int [] arr){
        int a = 0;
        int b = arr.length - 1;

        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void display (int arr[]){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        display(arr);
    }
}
