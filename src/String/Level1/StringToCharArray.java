package String.Level1;

import java.util.Scanner;

class StringToCharArray {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner next()
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Get character array using custom user-defined method
        char[] customCharArray = getCharacters(text);

        // Get character array using built-in toCharArray() method
        char[] builtinCharArray = text.toCharArray();

        // Compare the two character arrays
        boolean isMatch = compareCharArrays(customCharArray, builtinCharArray);

        // Display the result
        System.out.println("\n--- Character Array Comparison ---");
        System.out.print("Custom character array: ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in toCharArray(): ");
        for (char c : builtinCharArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nDo both character arrays match? " + isMatch);

        scanner.close();
    }
}