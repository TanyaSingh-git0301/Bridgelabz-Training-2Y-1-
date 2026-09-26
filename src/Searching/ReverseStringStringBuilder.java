package Searching;

import java.util.Scanner;

class ReverseStringStringBuilder {

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) {
        // Create a new StringBuilder object initialized with the input string
        StringBuilder sb = new StringBuilder(input);

        // Use reverse() method to reverse the character sequence
        sb.reverse();

        // Convert StringBuilder back to String and return
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to reverse string
        String reversedText = reverseString(text);

        // Display the result
        System.out.println("\n--- Result ---");
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversedText);

        scanner.close();
    }
}