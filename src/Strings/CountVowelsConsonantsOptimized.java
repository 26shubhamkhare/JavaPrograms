package Strings;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsConsonantsOptimized {
    public static void main(String[] args) {
        // Input string
        String str = "Hello World";

        // Call the function to count vowels and consonants
        countVowelsAndConsonantsOptimized(str);
}
// Function to count vowels and consonants using HashSet
public static void countVowelsAndConsonantsOptimized(String str) {
    // Convert the string to lowercase to handle case-insensitive comparison
    str = str.toLowerCase();

    // Set of vowels for faster lookup
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    int vowelCount = 0;
    int consonantCount = 0;

    // Traverse through each character in the string
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        // Check if the character is a vowel using the Set
        if (vowels.contains(ch)) {
            vowelCount++;
        }
        // Check if the character is a consonant (alphabet but not a vowel)
        else if (ch >= 'a' && ch <= 'z') {
            consonantCount++;
        }
    }

    // Print the number of vowels and consonants
    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of consonants: " + consonantCount);
}
}
/*Explanation of Optimized Solution:
HashSet for Vowels: Instead of checking each vowel individually, we use a HashSet for faster lookup.
Efficiency: This approach reduces the number of comparisons and makes the code more readable.

Both the brute force and optimized solutions work well for counting vowels and consonants, with the HashSet-based solution being more efficient for larger input strings.*/