package Sorting;

import java.util.Scanner;

class MergeSortBookPrices {

    // Main function that sorts prices[left...right] using merge()
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merges two subarrays of prices[].
    // First subarray is prices[left..mid]
    // Second subarray is prices[mid+1..right]
    public static void merge(double[] prices, int left, int mid, int right) {
        // Sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();

        double[] prices = new double[n];

        // Input book prices
        System.out.println("Enter the prices of " + n + " books:");
        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + " price: $");
            prices[i] = scanner.nextDouble();
        }

        // Perform Merge Sort
        mergeSort(prices, 0, prices.length - 1);

        // Display sorted book prices
        System.out.println("\n--- Sorted Book Prices (Ascending Order) ---");
        for (double price : prices) {
            System.out.printf("$%.2f ", price);
        }
        System.out.println();

        scanner.close();
    }
}