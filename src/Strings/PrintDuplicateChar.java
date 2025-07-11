package Strings;
/* Here is a basic Java program to print the duplicate characters in a string.

Brute Force Solution (Basic Approach):*/

import java.util.Scanner;

public class PrintDuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the function to print duplicate characters
        findDuplicateCharacters(str);
    }

    // Function to find and print duplicate characters using brute force
    public static void findDuplicateCharacters(String str) {
        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Loop through each character and compare with other characters
        System.out.println("Duplicate characters are: ");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(str.charAt(i));
                str = str.replace(str.charAt(i), ' '); // To avoid printing the same character multiple times
            }
        }
    }
}

/*
 * Explanation:
 * Function findDuplicateCharacters: This function takes a string as input,
 * converts it to lowercase, and then uses a nested loop to find and print
 * duplicate characters.
 * 
 * Avoid printing the same character multiple times: After finding and printing
 * a duplicate character, we replace all occurrences of that character in the
 * string with a space (' ') to avoid printing it again.
 */