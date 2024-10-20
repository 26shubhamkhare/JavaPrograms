package Strings;

//To check if a string contains only digits in Java.
public class CheckOnlyDigitsBruteForce {
    public static void main(String[] args) {
        // Test strings
        String str1 = "123456";
        String str2 = "123a456";

        // Call the function to check if the string contains only digits
        System.out.println("Is \"" + str1 + "\" only digits? " + containsOnlyDigits(str1));
        System.out.println("Is \"" + str2 + "\" only digits? " + containsOnlyDigits(str2));
    }

    // Function to check if a string contains only digits
    public static boolean containsOnlyDigits(String str) {
        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If any character is not a digit, return false
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        // If all characters are digits, return true
        return true;
    }
}
/*
 * Explanation:
 * Character.isDigit(): This method checks if a given character is a digit.
 * Loop: We loop through each character in the string and check if it is a
 * digit. If any character is not a digit, we return false.
 * 
 */