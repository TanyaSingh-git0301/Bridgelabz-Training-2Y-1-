package Arrays.Logical_Problems;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Maximum {
    public static int maxElement(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter the array's element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("MAXIMUM VALUE : "+maxElement(arr));
    }
}
