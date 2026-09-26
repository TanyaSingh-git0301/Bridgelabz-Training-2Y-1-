package Arrays.Leetcode;

import java.util.*;
public class Leetcode_50 {
        public static double myPow(double x, int n) {
            double pow=Math.pow(x,n);
            return pow;
        }

    static void main() {
        Scanner sc=new Scanner(System.in);
        double x = sc.nextDouble();
        int n=sc.nextInt();
        System.out.println(myPow(x,n));
    }
    }
