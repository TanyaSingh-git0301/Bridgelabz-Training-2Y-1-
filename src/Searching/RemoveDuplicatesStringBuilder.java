package Searching;

import java.util.HashSet;
import java.util.Scanner;

class RemoveDuplicatesStringBuilder {

    // Method to remove duplicate characters using StringBuilder and HashSet
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is not in the set, add it to set and append to StringBuilder
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to remove duplicates
        String cleanedText = removeDuplicates(text);

        // Display the result
        System.out.println("\n--- Result ---");
        System.out.println("Original String: " + text);
        System.out.println("String without Duplicates: " + cleanedText);

        scanner.close();
    }
}