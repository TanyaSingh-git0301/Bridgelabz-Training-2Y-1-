package Arrays.Leetcode;

import java.util.*;
public class Leetcode_189 {
        public static void rotate(int[] nums, int k) {
            k  = k % nums.length;
            int n = nums.length - 1;

            reverse(nums, 0, n);
            reverse(nums, 0, k-1);
            reverse(nums, k, n);
        }
        public static void reverse(int[] nums, int a ,int b){
            while(a<b){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--;
            }
        }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
    }
    }

