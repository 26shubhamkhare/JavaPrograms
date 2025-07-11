package Strings;

import java.util.Arrays;

public class AnagramCheckBruteForce {
    public static void main(String[] args) {
        // Test strings
        String str1 = "listen";
        String str2 = "silent";

        // Call the function to check if they are anagrams
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
}

 // Function to check if two strings are anagrams
 public static boolean areAnagrams(String str1, String str2) {
    // Convert strings to lowercase and remove spaces
    str1 = str1.toLowerCase().replaceAll("\\s", "");
    str2 = str2.toLowerCase().replaceAll("\\s", "");

    // If the lengths are different, they can't be anagrams
    if (str1.length() != str2.length()) {
        return false;
    }

    // Convert strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // Compare sorted arrays
    return Arrays.equals(charArray1, charArray2);
}
}

/*Explanation:
Case Insensitivity: Convert both strings to lowercase to handle case differences.
Removing spaces: The replaceAll("\\s", "") function is used to remove spaces, making it flexible for phrases.
Sorting: We convert both strings to character arrays and sort them. If the sorted versions are equal, the strings are anagrams.
Time Complexity: Sorting has a time complexity of O(n log n), so this solution takes O(n log n). */