package String.Level2;

import java.util.Scanner;

class StringLengthWithoutBuiltIn {

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            // Loop indefinitely until IndexOutOfBoundsException occurs
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when reaching the end of the string
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner next() method
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Find length using custom user-defined method
        int customLength = getLength(input);

        // Find length using built-in length() method
        int builtinLength = input.length();

        // Display results
        System.out.println("\n--- String Length Results ---");
        System.out.println("Length calculated using custom method: " + customLength);
        System.out.println("Length calculated using built-in length(): " + builtinLength);

        scanner.close();
    }
}