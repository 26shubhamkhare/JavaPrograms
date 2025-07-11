package Strings;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        // Test string
        String str = "hello world from java";

        // Call the function to convert the first letter of each word to uppercase
        String result = capitalizeFirstLetter(str);

        // Print the result
        System.out.println(result);   
}
// Function to capitalize the first letter of each word
public static String capitalizeFirstLetter(String str) {
    // Split the string into words
    String[] words = str.split(" ");
    StringBuilder capitalizedString = new StringBuilder();

    // Loop through each word
    for (String word : words) {
        // Capitalize the first letter and append the rest of the word
        if (!word.isEmpty()) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            capitalizedString.append(capitalizedWord).append(" ");
        }
    }

    // Convert StringBuilder to String and trim any trailing space
    return capitalizedString.toString().trim();
}
}

/*Explanation:
Split the String: We split the string by spaces to get individual words using split(" ").
Capitalize Each Word: For each word, we capitalize the first letter using substring(0, 1).toUpperCase() and append the rest of the word (substring(1)).
StringBuilder: We use StringBuilder to efficiently build the new string.
Trim: The final result is trimmed to remove any extra space at the end. */