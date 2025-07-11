package Strings;

public class FirstNonRepeatingCharacterBruteForce {
    
    public static void main(String[] args) {
        // Test string
        String str = "swiss";

        // Call the function to find the first non-repeating character
        char result = firstNonRepeatingCharacter(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
}
 // Function to find the first non-repeating character
 public static char firstNonRepeatingCharacter(String str) {
    int len = str.length();

    for (int i = 0; i < len; i++) {
        boolean isRepeating = false;

        for (int j = 0; j < len; j++) {
            // Skip the character itself but check for duplicates
            if (i != j && str.charAt(i) == str.charAt(j)) {
                isRepeating = true;
                break;
            }
        }

        // If no duplicates found, return the character
        if (!isRepeating) {
            return str.charAt(i);
        }
    }

    // If no non-repeating character is found
    return '\0';
}
}
/*Explanation:
Two Loops: The outer loop selects each character one by one, and the inner loop checks if that character appears again in the string.
Return First Non-Repeating Character: Once a character is found that does not repeat, it is returned.
Time Complexity: O(n²) because of the nested loops.
 */