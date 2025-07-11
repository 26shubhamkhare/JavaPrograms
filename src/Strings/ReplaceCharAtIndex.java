package Strings;

/*Examples of Replacing Characters in a String
Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
Output: "Geeks For Geeks."*/
public class ReplaceCharAtIndex {

	public static void main(String[] args) {

		String str = "Geeks Gor Geeks";
		int index = 6;
		char ch = 'F';
		System.out.println("Original string:" + str);
		/* 1.
		 * There is no predefined method in String Class to replace a specific character
		 * in a String, as of now. However, this can be achieved indirectly by
		 * constructing a new String with 2 different substrings, one from the beginning
		 * till the specific index – 1, the new character at the specific index, and the
		 * other from the index + 1 till the end.
		 */
		str = str.substring(0, index) + ch + str.substring(index + 1);

		/* 2.
		 * Using StringBuffer StringBuffer string = new StringBuffer(str);
		 * string.setCharAt(index, ch); System.out.println("Modified String = " +
		 * string);
		 * 
		 */

		System.out.println("Modified String = " + str);

	}

}
