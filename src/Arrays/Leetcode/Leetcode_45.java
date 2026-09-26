package Arrays.Leetcode;

import java.util.*;
public class Leetcode_45 {
        public static int jump(int[] nums) {
            int n=nums.length;
            int[] dp= new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[n-1]=0;
            for(int i=n-2;i>=0;i--){
                for(int jumps=1;jumps<=nums[i];jumps++){
                    int next = i + jumps;
                    if(next < n && dp[next] != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i], 1+dp[next]);
                    }
                }
            }
            return dp[0];
        }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int nums[] =new int[k];
        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(jump(nums));
      }
    }
