package String.Level1;

import java.util.Scanner;

class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are not equal, the strings cannot be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Compare using user-defined method
        boolean customResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean builtinResult = str1.equals(str2);

        // Display results and check if custom method matches built-in method
        System.out.println("\n--- Comparison Results ---");
        System.out.println("Result using custom charAt() method: " + customResult);
        System.out.println("Result using built-in equals() method: " + builtinResult);

        if (customResult == builtinResult) {
            System.out.println("Both methods produced the same result!");
        } else {
            System.out.println("The results do not match.");
        }

        scanner.close();
    }
}
