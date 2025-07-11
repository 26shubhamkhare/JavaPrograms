package Strings;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Input string
        String str = "Hello World";

        // Call the function to count vowels and consonants
        countVowelsAndConsonants(str);
}
  // Function to count vowels and consonants in a string
  public static void countVowelsAndConsonants(String str) {
    // Convert the string to lowercase to handle case-insensitive comparison
    str = str.toLowerCase();

    int vowelCount = 0;
    int consonantCount = 0;

    // Traverse through each character in the string
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        }
        // Check if the character is a consonant (alphabet but not a vowel)
        else if (ch >= 'a' && ch <= 'z') {
            consonantCount++;
        }
    }

    // Print the number of vowels and consonants
    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of consonants: " + consonantCount);
}
}
/*Explanation:
Lowercase Conversion: We convert the string to lowercase to make the comparison case-insensitive.
Checking for Vowels: We use a simple condition to check if the character is one of the vowels (a, e, i, o, u).
Checking for Consonants: We ensure the character is a letter (a-z), but not a vowel, to classify it as a consonant.
Skipping Non-Alphabet Characters: Spaces, punctuation, and numbers are ignored because they don't fall in the a-z range. */