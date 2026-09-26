package Sorting;

import java.util.Scanner;

class QuickSortProductPrices {

    // Method to perform Quick Sort on product prices
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Partition index: prices[pi] is at its correct sorted position
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    // Partition method taking the last element as the pivot
    public static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (prices[j] <= pivot) {
                i++;

                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i + 1] and pivot (prices[high])
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        double[] prices = new double[n];

        // Input product prices
        System.out.println("Enter the prices of " + n + " products:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product " + (i + 1) + " price: $");
            prices[i] = scanner.nextDouble();
        }

        // Perform Quick Sort
        quickSort(prices, 0, prices.length - 1);

        // Display sorted product prices
        System.out.println("\n--- Sorted Product Prices (Ascending Order) ---");
        for (double price : prices) {
            System.out.printf("$%.2f ", price);
        }
        System.out.println();

        scanner.close();
    }
}