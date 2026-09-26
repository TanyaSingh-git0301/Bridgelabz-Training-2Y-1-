package String.Level2;

import java.util.Scanner;

class SplitTextAndCompare {

    // Method to find the length of a string without using built-in length()
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

    // Method to split text into words using charAt() without using built-in split()
    public static String[] splitText(String text) {
        int textLength = getLength(text);

        // Count number of words (spaces + 1)
        int spaceCount = 0;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Store space indices in a 1D array
        int[] spaceIndexes = new int[spaceCount];
        int spaceIndex = 0;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }

        // Extract words using space indexes
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        // Extract the last word
        String lastWord = "";
        for (int j = start; j < textLength; j++) {
            lastWord += text.charAt(j);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            // Compare characters of each word
            if (getLength(arr1[i]) != getLength(arr2[i])) {
                return false;
            }
            for (int j = 0; j < getLength(arr1[i]); j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine() method
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Split text using custom user-defined method
        String[] customWords = splitText(text);

        // Split text using built-in split() method
        String[] builtinWords = text.split(" ");

        // Compare the two string arrays
        boolean isMatch = compareStringArrays(customWords, builtinWords);

        // Display results
        System.out.println("\n--- Split Words (Custom Method) ---");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\n--- Split Words (Built-in split()) ---");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        System.out.println("\nDo both word arrays match? " + isMatch);

        scanner.close();
    }
}
