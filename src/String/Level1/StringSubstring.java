package String.Level1;

import java.util.Scanner;

class StringSubstring {

    // Method to create a substring from a string using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for text, start index, and end index
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Validate index boundaries
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid indices entered!");
            scanner.close();
            return;
        }

        // Generate custom substring
        String customSubstring = createSubstring(text, start, end);

        // Generate built-in substring
        String builtinSubstring = text.substring(start, end);

        // Compare both substrings using custom method
        boolean isMatch = compareUsingCharAt(customSubstring, builtinSubstring);

        // Display results
        System.out.println("\n--- Substring Results ---");
        System.out.println("Custom substring using charAt(): " + customSubstring);
        System.out.println("Built-in substring(): " + builtinSubstring);
        System.out.println("Are both substrings identical? " + isMatch);

        scanner.close();
    }
}