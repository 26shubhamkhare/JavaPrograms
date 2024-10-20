package Strings;

import java.util.HashMap;

public class CountCharOccurrenceOptimized {
    public static void main(String[] args) {
        // Input string
        String str = "hello world";

        // Call the function to count character occurrences
        countCharOccurrencesOptimized(str);
    }

    // Function to count character occurrences using HashMap
    public static void countCharOccurrencesOptimized(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Traverse through the string and count each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Skip spaces or other unwanted characters if necessary
            if (currentChar != ' ') { // Skip spaces
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
            }
        }

        // Print character counts
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}
/*
 * Explanation:
 * HashMap: We use a HashMap<Character, Integer> to store each character as the
 * key and its occurrence as the value.
 * Counting occurrences: For each character, we either insert it into the map
 * with a count of 1 or increment its count if it’s already in the map.
 * Time Complexity: O(n) as we only need to traverse the string once.
 */