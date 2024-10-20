package Strings;

public class CountCharOccurrence {
    public static void main(String[] args) {
        // Input string
        String str = "hello world";

        // Call the function to count character occurrences
        countCharOccurrences(str);
    }

    // Function to count character occurrences using brute force (skip spaces)
    public static void countCharOccurrences(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Skip if the character is a space
            if (currentChar == ' ') {
                continue;
            }

            int count = 0;

            // Skip if the character is already printed (i.e., it's already counted)
            boolean isCounted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == currentChar) {
                    isCounted = true;
                    break;
                }
            }
            if (isCounted) {
                continue;
            }

            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Print the character and its count
            System.out.println(currentChar + ": " + count);
        }
    }
}

/*
 * Explanation:
 * Convert to lowercase: The string is converted to lowercase to handle case
 * insensitivity.
 * Nested loops: The outer loop picks each character, and the inner loop counts
 * how many times that character appears in the string.
 * Avoid duplicate counting: Before counting, the character is checked to ensure
 * it hasn't been counted already.
 */