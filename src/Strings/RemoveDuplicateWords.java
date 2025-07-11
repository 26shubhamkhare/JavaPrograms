package Strings;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "It is still day one day at Amazon Amazon";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a result string to store the final sentence without duplicates
        String result = "";

        // Loop through each word
        for (String word : words) {
            // Check if the word is already in the result string
            // We use " " + word + " " to ensure we only match full words and not partial matches
            if (!result.contains(" " + word + " ") && !result.startsWith(word + " ") && !result.endsWith(" " + word)) {
                // If the word is not in the result, add it with a space
                result += word + " ";
            }
        }

        // Trim the result to remove the trailing space
        result = result.trim();

        // Output the result
        System.out.println("Sentence without duplicate words: " + result);
    }
}
/*While the code works, it's not as efficient as using a HashSet or List, especially for long sentences, because checking for duplicates involves a string search, which could lead to a higher time complexity (approximately O(n^2) in the worst case).
-------------------------------------------------------------------
Example Scenario:
Let’s assume result = "day at Amazon " and the word being checked is "day".

result.contains(" day "): This will check for " day " in the middle of the string and return true because "day" is present in the sentence.
result.startsWith("day" + " "): This will check if the string starts with "day " (since "day" is the first word), and return true.
result.endsWith(" " + word): This will check if the string ends with " day".
Each check is tailored to cover different cases (start, middle, or end), ensuring that words are only added once, no matter where they appear.
 */