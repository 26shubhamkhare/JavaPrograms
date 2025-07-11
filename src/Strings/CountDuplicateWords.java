package Strings;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords{
    public static void main(String[] args) {
        String input = "This is a test. This test is just a test. A a";
        countDuplicateWords(input);
    }

    public static void countDuplicateWords(String input) {
        // Remove punctuation and convert the string to lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = input.split(" ");

        // Use a HashMap to keep track of word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate over each word
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Variable to count the number of duplicate words
        int duplicateCount = 0;

        // Iterate over the entries in the map
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            // If the count of a word is greater than 1, it's a duplicate
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.println("Duplicate word: " + entry.getKey() + " - Count: " + entry.getValue());
            }
        }

        // Print the total number of duplicate words
        System.out.println("Total number of duplicate words: " + duplicateCount);
    }
}
