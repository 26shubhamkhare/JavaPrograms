package Strings;

public class reverseEachWord {

	public static void main(String[] args) {
		String str = "I love java code";
		String output = reverseEachWordofString(str);
		System.out.println(output);

	}

	public static String reverseEachWordofString(String input) {
		String words[] = input.split(" ");
		String reverseString = "";

		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString;

	}

}
