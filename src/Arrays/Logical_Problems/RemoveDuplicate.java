package Arrays.Logical_Problems;

import java.util.Scanner;
public class RemoveDuplicate {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void removeDuplicate(int arr []){
        System.out.println("Inital array :");
        display(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        System.out.println("After removal : ");
        display(arr);
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[] =new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        removeDuplicate(arr);
    }
}
