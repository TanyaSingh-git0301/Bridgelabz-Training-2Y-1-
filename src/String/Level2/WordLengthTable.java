package String.Level2;


import java.util.Scanner;

class WordLengthTable {

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

        // Count number of spaces
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

        // Extract words using space indices
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

    // Method to return a 2D array containing each word and its length as a String
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengthData = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthData[i][0] = words[i];
            // Use String.valueOf() to convert integer length into String
            wordLengthData[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordLengthData;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine()
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Get 2D array of words and their corresponding lengths
        String[][] wordLengthData = getWordsWithLengths(words);

        // Display results in tabular format, converting String length back to Integer
        System.out.println("\n--- Word and Length Analysis ---");
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("--------------------------");

        for (int i = 0; i < wordLengthData.length; i++) {
            String word = wordLengthData[i][0];
            // Convert length back from String to Integer for printing
            int length = Integer.parseInt(wordLengthData[i][1]);
            System.out.printf("%-15s %-10d\n", word, length);
        }

        scanner.close();
    }
}