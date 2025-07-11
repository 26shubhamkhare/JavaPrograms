package Strings;

public class ReverseLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Ram is going to school";
		String result = reverseLastWord(str);
		System.out.println(result);

	}

	public static String reverseLastWord(String str) {
		// Step 1: Find the last space in the string
		int lastSpaceIndex = -1;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				lastSpaceIndex = i;
				break;
			}
		}

		// Step 2: Separate the string into two parts
		String beforeLastWord = "";
		for (int i = 0; i <= lastSpaceIndex; i++) {
			beforeLastWord += str.charAt(i);
		}

		String lastWord = "";
		for (int i = lastSpaceIndex + 1; i < str.length(); i++) {
			lastWord += str.charAt(i);
		}

		// Step 3: Reverse the last word
		String reversedLastWord = "";
		for (int i = lastWord.length() - 1; i >= 0; i--) {
			reversedLastWord += lastWord.charAt(i);
		}

		// Step 4: Combine the parts together
		return beforeLastWord + reversedLastWord;
	}

}

/*
 * Explanation: Find the last space: The code iterates through the string from
 * the end to find the last space character, marking the index of the last word.
 * Separate the string: The string is split manually into two parts: everything
 * before the last word and the last word itself, by iterating through the
 * string. Reverse the last word: The last word is reversed by iterating through
 * it backward and appending each character to a new string. Combine the parts:
 * Finally, the code concatenates the reversed last word with the rest of the
 * string to form the final result.
 */
