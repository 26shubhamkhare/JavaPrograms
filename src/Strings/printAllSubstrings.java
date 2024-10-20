package Strings;

public class printAllSubstrings {
    public static void main(String[] args) {
        // Test string
        String str = "abc";

        // Call the function to print all substrings
        printAllSubstrings(str);
}
 // Function to print all substrings of a string
 public static void printAllSubstrings(String str) {
    int len = str.length();

    // Loop over all possible starting points
    for (int i = 0; i < len; i++) {
        // Loop over all possible ending points
        for (int j = i + 1; j <= len; j++) {
            // Extract the substring from index i to j
            System.out.println(str.substring(i, j));
        }
    }
}
}

/*Explanation:
Outer Loop: Iterates over each starting index i in the string.
Inner Loop: Iterates over each ending index j, starting from i + 1, to generate all substrings starting from index i.
substring(i, j): This method extracts the substring from index i to j-1 (end index is exclusive). */