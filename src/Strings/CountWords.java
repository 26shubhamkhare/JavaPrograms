package Strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello Shubham to the Java World";
        int count = 0;

        // Check if the first character is not a space (if the string starts with a word)
        if (str.charAt(0) != ' ') {
            count++;
        }

        // Loop from the second character to the end of the string
        for (int i = 1; i < str.length(); i++) {
            // Increment count if a space is followed by a non-space character (indicating a new word)
            if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
                count++;
            }
        }

        // Output the word count
        System.out.println("Word count: " + count);
    }
}
