package Strings;

public class CapitalizeFirstLetterOptimized {
    public static void main(String[] args) {
        // Test string
        String str = "hello world from java";

        // Call the function to convert the first letter of each word to uppercase
        String result = capitalizeFirstLetterOptimized(str);

        // Print the result
        System.out.println(result);
}
  // Function to capitalize the first letter of each word without splitting the string
  public static String capitalizeFirstLetterOptimized(String str) {
    StringBuilder capitalizedString = new StringBuilder(str.length());
    boolean capitalizeNext = true;

    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);

        // If the character is a space, the next character should be capitalized
        if (currentChar == ' ') {
            capitalizeNext = true;
            capitalizedString.append(currentChar);
        } else if (capitalizeNext) {
            // Capitalize the first letter of the word
            capitalizedString.append(Character.toUpperCase(currentChar));
            capitalizeNext = false;
        } else {
            // Append the character as is
            capitalizedString.append(currentChar);
        }
    }

    return capitalizedString.toString();
}
}

/*Explanation of Optimized Solution:
Single Loop: We use a single loop to traverse through the string.
Capitalization Logic: We keep track of when to capitalize using a boolean flag (capitalizeNext). It is set to true after every space and resets after capitalizing a letter.
Efficient String Building: We build the new string directly without splitting or additional arrays. */

/*Comparison:
Brute Force: Splits the string into words, processes each word, and then rejoins them.
Optimized: Traverses the string once, processing characters on the fly, which reduces the overhead of creating arrays.
Both methods work well, but the optimized version is more efficient in terms of both time and space */