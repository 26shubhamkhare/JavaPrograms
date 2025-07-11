package Strings;
//Optimized Approach
public class RemoveWhiteSpacesOptimized {
    public static void main(String[] args) {
        String sentence = "It is still day one at Amazon";

        // Use replaceAll() with a regular expression to remove all spaces
        String result = sentence.replaceAll("\\s", "");

        // Output the result
        System.out.println("String without spaces (Optimized): " + result);
    }
}
/*Breakdown:
replaceAll("\\s", ""):
\\s: A regular expression that matches any whitespace character (space, tab, newline, etc.).
"": An empty string that replaces all the matched white spaces.
Comparison:
Brute Force: Manually iterates over the string to filter out spaces. Time complexity is O(n), where n is the length of the string.
Optimized (replaceAll()): Uses a regular expression to efficiently replace all white spaces in one step, also O(n) but more concise and optimized for common use cases.
Both methods give the same result. The optimized version using replaceAll() is generally preferred for its simplicity and clarity.
 */
