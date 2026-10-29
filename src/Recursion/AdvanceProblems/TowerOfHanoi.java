package Recursion.AdvanceProblems;

import java.util.*;
public class TowerOfHanoi {
    public static void toh(int n,char source, char helper, char destination){
        if(n==1){
            System.out.println("Move disk 1 from " +source +" to " +destination);
            return;
        }
        toh(n-1,source,destination,helper);
        System.out.println("Move disk "+n +" from " +source +" to " +destination);
        toh(n-1,helper,source,destination);
    }

    static void main() {
        int n=5;
        toh(n,'A','B','C');
    }
}
