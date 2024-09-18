package Strings;

import java.util.ArrayList;

public class RemoveDuplicateWordsUsingList {
     public static void main(String[] args) {
        String sentence = "It is still day one day at Amazon Amazon";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create an ArrayList to store unique words
        ArrayList<String> uniqueWords = new ArrayList<>();

        // Loop through the words
        for (String word : words) {
            // Check if the word is already in the list
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);  // Add the word if it's not already in the list
            }
        }

        // Join the unique words to form the sentence without duplicates
        String result = String.join(" ", uniqueWords);

        // Output the result
        System.out.println("Sentence without duplicate words: " + result);
    }
}

/*
 * Explanation:
Split the Sentence: The sentence is split into individual words using split(" ").
Track Unique Words: We use an ArrayList to keep track of words that have been seen. If a word is not in the list, we add it.
Check for Duplicates: We use contains() to check if a word is already in the list before adding it.
Reconstruct the Sentence: We use String.join(" ", uniqueWords) to join the unique words back into a single string.

--------------------------------
Summary:
In this solution, we use an ArrayList to manually track the unique words.
The contains() method checks if a word has already been added, and if not, it appends the word to the list.
This approach works without using HashSet or LinkedHashSet, though it may not be as efficient in terms of time complexity since contains() has a time complexity of O(n) for each lookup. However, it’s a valid solution if you don't want to use hash-based collections.
 */