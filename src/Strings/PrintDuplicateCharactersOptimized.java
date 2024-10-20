package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicateCharactersOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the function to print duplicate characters using HashMap
        findDuplicateCharactersOptimized(str);
    }

    // Function to find and print duplicate characters using HashMap
    public static void findDuplicateCharactersOptimized(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Use a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Traverse through the string and count each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') { // Ignore spaces
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters are: ");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c);
            }
        }
    }
}

/*
 * Explanation:
 * Function findDuplicateCharactersOptimized: This function takes a string as
 * input, converts it to lowercase, and then uses a HashMap to store the
 * frequency of each character. It then prints only those characters that appear
 * more than once.
 * Efficient counting: The function makes a single pass through the string to
 * count the occurrences of characters, making it more efficient than the brute
 * force approach.
 * 
 * The brute force method has higher time complexity (O(n²)) due to nested
 * loops, whereas the optimized solution using HashMap has better performance
 * with O(n) complexity.
 * 
 */