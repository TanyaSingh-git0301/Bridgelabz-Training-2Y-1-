package Searching;

import java.util.Scanner;

class StringBufferConcatenation {

    // Method to concatenate an array of strings using StringBuffer
    public static String concatenateStrings(String[] words) {
        // Create a new StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array and append to StringBuffer
        for (String word : words) {
            sb.append(word);
        }

        // Return the concatenated result as a String
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of strings to concatenate: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] words = new String[count];

        // Input strings
        System.out.println("Enter " + count + " strings:");
        for (int i = 0; i < count; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        // Concatenate using custom method
        String result = concatenateStrings(words);

        // Display output
        System.out.println("\n--- Result ---");
        System.out.println("Concatenated String: " + result);

        scanner.close();
    }
}