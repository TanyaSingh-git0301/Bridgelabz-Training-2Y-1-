package Recursion.BasicProgram;

import java.util.*;
public class Power {
    public static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        int small = pow(p, q-1);
        return p*small;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number :");
        int p=sc.nextInt();
        System.out.println("Power :");
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
