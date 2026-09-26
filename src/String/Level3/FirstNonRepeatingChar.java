package String.Level3;

import java.util.Scanner;

class FirstNonRepeatingChar {

    // Method to find the first non-repeating character in a string using charAt()
    public static char findFirstNonRepeatingChar(String text) {
        // Frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // Loop through text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Loop through text again to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch; // Found first non-repeating character
            }
        }

        // Return null character '\0' if no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Call user-defined method
        char result = findFirstNonRepeatingChar(text);

        // Display results
        System.out.println("\n--- Result ---");
        if (result != '\0') {
            System.out.println("The first non-repeating character in \"" + text + "\" is: '" + result + "'");
        } else {
            System.out.println("There is no non-repeating character in the given text.");
        }

        scanner.close();
    }
}