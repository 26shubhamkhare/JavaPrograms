package Strings;

import java.util.HashMap;

public class CountWordsOccurrenceOptimized {
    public static void main(String[] args) {
        // Input string
        String str = "Java is great and Java is powerful";

        // Call the function to count word occurrences
        countWordOccurrencesOptimized(str);
}
 // Function to count word occurrences using HashMap
 public static void countWordOccurrencesOptimized(String str) {
    // Convert the string to lowercase to handle case-insensitive comparison
    str = str.toLowerCase();

    // Split the string into words based on spaces
    String[] words = str.split(" ");

    // Create a HashMap to store word counts
    HashMap<String, Integer> wordCountMap = new HashMap<>();

    // Traverse through the words and count each word
    for (String word : words) {
        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
    }

    // Print word counts
    for (String word : wordCountMap.keySet()) {
        System.out.println(word + ": " + wordCountMap.get(word));
    }
}
}
/*Explanation:
HashMap: We use a HashMap<String, Integer> to store each word as the key and its occurrence as the value.
Counting occurrences: For each word, we either insert it into the map with a count of 1 or increment its count if it’s already in the map.
Time Complexity: O(n) as we only need to traverse the array once. */