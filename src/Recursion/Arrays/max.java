package Recursion.Arrays;

public class max {
    public static int max(int[] arr, int index){
        if (index == 1) {
            return arr[0];
        }
        int small = max(arr, index-1);
        return Math.max(arr[index - 1], small);
    }

    static void main() {
        int[] arr={1,3,2,4,2,1};
        int index=6;
        System.out.println(max(arr,index));
    }
}
