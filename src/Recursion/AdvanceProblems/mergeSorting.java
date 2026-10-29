package Recursion.AdvanceProblems;

import java.util.*;
public class mergeSorting {
    public static void mergSort(int arr[], int l,int r){
        if(l>=r){
            return;
        }
        int mid= (l+r)/2;
        mergSort(arr,l,mid);
        mergSort(arr,mid+1,r);
        merg(arr,l,mid,r);
    }
    public static void merg(int []arr, int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }

    }
}
