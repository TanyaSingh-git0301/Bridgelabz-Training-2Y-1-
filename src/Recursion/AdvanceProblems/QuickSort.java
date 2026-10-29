package Recursion.AdvanceProblems;


import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;

// Count elements smaller than pivot
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }

        int pivotIndex = start + count;
        swap(arr, start, pivotIndex);
        int i = start;
        int j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {7, 13, 8, 5, 10, 2, 4};

        System.out.println("Before Sorting the Array:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting the Array:");
        System.out.println(Arrays.toString(arr));
    }
}