package Recursion.Arrays;

public class LinearSearch {
    public static int search(int[] arr, int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        int small = search(arr, index+1, target);
        return small;
    }

    static void main() {
        int arr[]={3,5,2,9,1};
        int index= 0;
        int target= 9;
        System.out.println(search(arr,index,target));
    }
}
