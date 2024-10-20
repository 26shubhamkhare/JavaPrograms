package Strings;

public class PalindromeCheckRecursiveOptimized {
    public static void main(String[] args) {
        // Test string
        String str = "A man a plan a canal Panama";

        // Call the function to check if the string is a palindrome
        boolean result = isPalindrome(str.toLowerCase().replaceAll("\\s", ""));
        System.out.println("Is the string a palindrome? " + result);
}
 // Function to check if a string is a palindrome recursively
 public static boolean isPalindrome(String str) {
    // Base case: If the string is empty or has one character, it's a palindrome
    if (str.length() <= 1) {
        return true;
    }

    // Compare first and last characters
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
        return false;
    }

    // Recursively check the substring between the first and last characters
    return isPalindrome(str.substring(1, str.length() - 1));
}
}

/*
Here’s how you can check if a string is a palindrome in Java.

Brute Force Solution:
In this approach, we:

Convert the string to lowercase (to handle case insensitivity).
Remove spaces (optional, depending on requirements).
Compare the characters from the start and end of the string moving inward.
java
Copy code
public class PalindromeCheckBruteForce {
    public static void main(String[] args) {
        // Test string
        String str = "A man a plan a canal Panama";

        // Call the function to check if the string is a palindrome
        boolean result = isPalindrome(str);
        System.out.println("Is the string a palindrome? " + result);
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove spaces
        str = str.toLowerCase().replaceAll("\\s", "");

        // Traverse the string from both ends
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // If characters at start and end don't match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}
Explanation:
Lowercase Conversion: We convert the string to lowercase to handle case-insensitive comparison.
Removing Spaces: The replaceAll("\\s", "") removes spaces, making the check work for sentences or phrases like "A man a plan a canal Panama".
Two-pointer comparison: We compare characters starting from the beginning (start) and the end (end) of the string, moving inward. If at any point the characters don’t match, it’s not a palindrome.
Time Complexity: O(n), as we need to traverse the string once.
Output:
For the string "A man a plan a canal Panama", the output will be:

vbnet
Copy code
Is the string a palindrome? true
Optimized Solution (Recursive Approach):
We can also solve this problem recursively by comparing the first and last characters, and then checking the substring between them.

java
Copy code
public class PalindromeCheckRecursive {
    public static void main(String[] args) {
        // Test string
        String str = "A man a plan a canal Panama";

        // Call the function to check if the string is a palindrome
        boolean result = isPalindrome(str.toLowerCase().replaceAll("\\s", ""));
        System.out.println("Is the string a palindrome? " + result);
    }

    // Function to check if a string is a palindrome recursively
    public static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursively check the substring between the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
Explanation:
Recursive Approach: We compare the first and last characters. If they match, we recursively check the substring excluding the first and last characters.
Base Case: If the string is empty or contains just one character, it is a palindrome.
Time Complexity: O(n), where n is the length of the string. */