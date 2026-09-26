package Arrays.Level2;

import java.util.Scanner;

class FriendsAgeAndHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of the 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height for the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height of each friend
        System.out.println("Enter age and height for the 3 friends:\n");
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age for " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height (in cm or meters) for " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();

            // Validate user input
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Age and height must be positive numbers. Try again.");
                i--; // Decrement counter to re-enter details for the same friend
            }
        }

        // Initialize variables to track index of youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the arrays to find youngest and tallest
        for (int i = 1; i < friends.length; i++) {
            // Find youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Find tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");

        scanner.close();
    }
}