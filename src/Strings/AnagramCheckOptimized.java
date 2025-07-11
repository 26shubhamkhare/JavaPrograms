package Strings;

import java.util.HashMap;

public class AnagramCheckOptimized {
    public static void main(String[] args) {
        // Test strings
        String str1 = "listen";
        String str2 = "silent";

        // Call the function to check if they are anagrams
        boolean result = areAnagramsOptimized(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
}
  // Function to check if two strings are anagrams using HashMap
  public static boolean areAnagramsOptimized(String str1, String str2) {
    // Convert strings to lowercase and remove spaces
    str1 = str1.toLowerCase().replaceAll("\\s", "");
    str2 = str2.toLowerCase().replaceAll("\\s", "");

    // If the lengths are different, they can't be anagrams
    if (str1.length() != str2.length()) {
        return false;
    }

    // Create a HashMap to store the frequency of characters
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    // Increment character counts for str1
    for (char c : str1.toCharArray()) {
        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    // Decrement character counts for str2
    for (char c : str2.toCharArray()) {
        if (!charCountMap.containsKey(c)) {
            return false;
        }
        charCountMap.put(c, charCountMap.get(c) - 1);
        if (charCountMap.get(c) == 0) {
            charCountMap.remove(c);
        }
    }

    // If the map is empty, the strings are anagrams
    return charCountMap.isEmpty();
}
}
/*Explanation:
Character Frequency Count: We use a HashMap<Character, Integer> to count the occurrences of each character in the first string. Then, for the second string, we decrement the count for each character.
Validation: If all counts become zero, the strings are anagrams. If we find any mismatch or if the HashMap is not empty at the end, they are not anagrams.
Time Complexity: O(n), as we only need to traverse both strings once. */