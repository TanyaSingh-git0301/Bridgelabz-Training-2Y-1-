package String.Level3;

import java.util.Scanner;

class UniqueCharacters {

    // Method to find the length of the text without using built-in length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);

        // Array to store unique characters (maximum possible size is length of text)
        char[] tempResult = new char[length];
        int uniqueCount = 0;

        // Nested loop logic to find unique characters
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if current character appeared previously in the string
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store in the temporary result array
            if (isUnique) {
                tempResult[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters count
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Call user-defined method
        char[] uniqueChars = findUniqueCharacters(text);

        // Display results
        System.out.println("\n--- Unique Characters ---");
        System.out.print("Unique characters in the string: ");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print("'" + uniqueChars[i] + "' ");
        }
        System.out.println("\nTotal unique characters count: " + uniqueChars.length);

        scanner.close();
    }
}