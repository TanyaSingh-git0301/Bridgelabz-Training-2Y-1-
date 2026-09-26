package Arrays.Leetcode;

import java.util.*;
public class Leetcode_41 {
    public static int firstMissingPositive(int[] nums){
        int n= nums.length;
        boolean[] present = new boolean[n+2];
        for(int num : nums){
            if(num>0 && num <= n){
                present[num] = true;
            }
        }
        for(int i=1;i<n+1;i++){
            if(!present[i]){
                return i;
            }
        }
        return 1;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(firstMissingPositive(nums));
    }
}
