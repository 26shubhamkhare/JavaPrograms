package Strings;

import java.util.HashMap;

public class FirstNonRepeatingCharacterOptimized {
    public static void main(String[] args) {
        // Test string
        String str = "swiss";

        // Call the function to find the first non-repeating character
        char result = firstNonRepeatingCharacterOptimized(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Function to find the first non-repeating character using HashMap
    public static char firstNonRepeatingCharacterOptimized(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // First pass: Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Second pass: Find the first character with a count of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCountMap.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found
        return '\0';
    }
}

/*
 * Explanation of Optimized Solution:
 * Frequency Count: In the first pass, we use a HashMap to count how many times
 * each character appears in the string.
 * Find First Unique: In the second pass, we check the count of each character
 * and return the first character with a count of 1.
 * Time Complexity: O(n), since we traverse the string twice (once to build the
 * frequency map, and once to find the first non-repeating character).
 * 
 * Comparison:
 * Brute Force: O(n²), less efficient for larger strings.
 * Optimized (HashMap): O(n), more efficient and recommended for larger input sizes.
 */