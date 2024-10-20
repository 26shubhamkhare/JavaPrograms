package Strings;

public class countWordOccurrences {
    public static void main(String[] args) {
        // Input string
        String str = "Java is great and Java is powerful";

        // Call the function to count word occurrences
        countWordOccurrences(str);
}
// Function to count word occurrences using brute force
public static void countWordOccurrences(String str) {
    // Convert the string to lowercase to handle case-insensitive comparison
    str = str.toLowerCase();

    // Split the string into words based on spaces
    String[] words = str.split(" ");

    // Traverse through each word in the string
    for (int i = 0; i < words.length; i++) {
        String currentWord = words[i];
        int count = 0;

        // Skip if the word has already been counted
        boolean isCounted = false;
        for (int k = 0; k < i; k++) {
            if (words[k].equals(currentWord)) {
                isCounted = true;
                break;
            }
        }
        if (isCounted) {
            continue;
        }

        // Count occurrences of the current word
        for (int j = 0; j < words.length; j++) {
            if (words[j].equals(currentWord)) {
                count++;
            }
        }

        // Print the word and its count
        System.out.println(currentWord + ": " + count);
    }
}
}

/*Explanation:
Convert to lowercase: The string is converted to lowercase to handle case-insensitive comparison.
Split the string: The string is split into words using spaces as the delimiter.
Nested loops: The outer loop iterates over each word, and the inner loop counts how many times that word appears in the array.
Avoid duplicate counting: Before counting a word, we ensure that it hasn’t already been counted. */
