package Sorting;

import java.util.Scanner;

class BubbleSortStudentMarks {

    // Method to perform Bubble Sort on student marks
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        // Input student marks
        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " mark: ");
            marks[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(marks);

        // Display sorted marks
        System.out.println("\n--- Sorted Student Marks (Ascending Order) ---");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        scanner.close();
    }
}
