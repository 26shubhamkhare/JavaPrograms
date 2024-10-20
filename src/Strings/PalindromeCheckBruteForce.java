package Strings;

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
/*Explanation:
Lowercase Conversion: We convert the string to lowercase to handle case-insensitive comparison.
Removing Spaces: The replaceAll("\\s", "") removes spaces, making the check work for sentences or phrases like "A man a plan a canal Panama".
Two-pointer comparison: We compare characters starting from the beginning (start) and the end (end) of the string, moving inward. If at any point the characters don’t match, it’s not a palindrome.
Time Complexity: O(n), as we need to traverse the string once. */