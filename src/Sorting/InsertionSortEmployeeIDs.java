package Sorting;

import java.util.Scanner;

class InsertionSortEmployeeIDs {

    // Method to perform Insertion Sort on Employee IDs
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            // Move elements of employeeIDs[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }

            // Place key in its correct position
            employeeIDs[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        int[] employeeIDs = new int[n];

        // Input employee IDs
        System.out.println("Enter " + n + " Employee IDs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + " ID: ");
            employeeIDs[i] = scanner.nextInt();
        }

        // Perform Insertion Sort
        insertionSort(employeeIDs);

        // Display sorted employee IDs
        System.out.println("\n--- Sorted Employee IDs (Ascending Order) ---");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
        System.out.println();

        scanner.close();
    }
}