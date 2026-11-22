package Stack;

import java.util.*;
public class MinScore {
    public static int minSum(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);

        int large = nums[n-3]-nums[0];
        int small = nums[n-1] - nums[2];
        int end = nums[n-2] - nums[1];

        return Math.min(large,Math.min(small,end));
    }

    static void main() {
        int[] nums = {1,4,7,8,5};
        System.out.println(minSum(nums));
    }
}
