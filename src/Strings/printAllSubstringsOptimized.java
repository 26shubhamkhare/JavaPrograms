package Strings;

import java.util.ArrayList;
import java.util.List;

public class printAllSubstringsOptimized {
    public static void main(String[] args) {
        // Test string
        String str = "abc";

        // Call the function to get all substrings
        List<String> substrings = getAllSubstrings(str);

        // Print the substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
}
// Function to get all substrings of a string
public static List<String> getAllSubstrings(String str) {
    int len = str.length();
    List<String> substrings = new ArrayList<>();

    // Loop over all possible starting points
    for (int i = 0; i < len; i++) {
        // Loop over all possible ending points
        for (int j = i + 1; j <= len; j++) {
            // Add the substring to the list
            substrings.add(str.substring(i, j));
        }
    }

    return substrings;
}
}

/*Explanation:
List to Store Substrings: We use an ArrayList to store all the substrings generated.
Same Two Loops: The loops are the same as the brute force solution, but we add the substrings to the list instead of printing them directly.
Return the List: This approach is useful when you need the substrings for further processing. */

/*Time Complexity:
Both solutions have a time complexity of O(n²), where n is the length of the string.
Both the brute force solution and the optimized version using a list work well to find all substrings of a string. The optimized version provides flexibility when further processing of substrings is needed. */