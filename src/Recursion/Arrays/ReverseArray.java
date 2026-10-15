package Recursion.Arrays;

public class ReverseArray {
    public static void rev(int[] arr, int index){
        if(index==0){
            return;
        }

        System.out.print(arr[index]+" ");
        rev(arr,index-1);
    }

    static void main() {
        int arr[]={1,2,3,4,5,6,7,8,9};
        rev(arr,arr.length-1);
    }
}
