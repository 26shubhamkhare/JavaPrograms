package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsUsingSet {
     public static void main(String[] args) {
        String sentence = "It is still day one day at Amazon Amazon";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Use LinkedHashSet to maintain the order and remove duplicates
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

        // Add each word to the LinkedHashSet
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Join the words back together to form the sentence without duplicates
        String result = String.join(" ", uniqueWords);

        // Output the result
        System.out.println("Sentence without duplicate words: " + result);
    }
}

/*
 * Explanation:
Split the Sentence: The sentence is split into individual words using split(" ").
Using LinkedHashSet: This ensures both uniqueness and the order of the words.
Reconstruct the Sentence: We use String.join(" ", uniqueWords) to join the unique words back into a single string.

------------------
Summary:
Brute Force Approach: Uses a HashSet to store unique words and builds the sentence manually. This method is simple but does not **preserve the word order**.
Optimized Approach: Uses a LinkedHashSet to both remove duplicates and maintain the original word order. This is a more refined solution that ensures the final sentence is both unique and ordered.

-------------------------------
LinkedHashSet is used because it maintains the order of insertion while removing duplicates.
The String.join() method is used to easily join the words back into a string.
This solution ensures that the order of words remains unchanged, and all duplicate words are removed from the sentence.
 */