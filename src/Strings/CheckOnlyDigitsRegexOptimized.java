package Strings;

public class CheckOnlyDigitsRegexOptimized {
    public static void main(String[] args) {
        // Test strings
        String str1 = "123456";
        String str2 = "123a456";

        // Call the function to check if the string contains only digits
        System.out.println("Is \"" + str1 + "\" only digits? " + containsOnlyDigitsRegex(str1));
        System.out.println("Is \"" + str2 + "\" only digits? " + containsOnlyDigitsRegex(str2));
}
 // Function to check if a string contains only digits using regex
 public static boolean containsOnlyDigitsRegex(String str) {
    // Use regular expression to check if the string contains only digits
    return str.matches("\\d+");
}
}
/*Explanation of Optimized Solution:
Regular Expression: The \\d+ pattern matches one or more digits. The matches() method checks if the entire string matches this pattern.
Efficiency: This method is more concise and potentially faster for larger strings.

Comparison:
Brute Force: O(n), checks each character individually.
Regex: O(n), uses a regular expression to match the entire string.
Both methods work efficiently to check if a string contains only digits. The regular expression approach is more concise, while the brute force approach gives more control over individual character checks.*/