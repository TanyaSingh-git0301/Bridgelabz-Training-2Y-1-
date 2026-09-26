package Arrays.Level2;

import java.util.Scanner;

class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a number and validate
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            scanner.close();
            return;
        }

        // Initialize variables as per hints
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = number;

        // Store digits of the number in the array
        while (temp != 0) {
            if (index == maxDigit) {
                // Break out of the loop if maxDigit capacity is reached
                break;
            }
            digits[index] = temp % 10; // Extract last digit
            temp /= 10;                // Remove last digit
            index++;
        }

        // Initialize variables to find largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array up to the count of stored digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist (all digits are identical).");
        }

        scanner.close();
    }
}
