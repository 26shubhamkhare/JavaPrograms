
public class palindromeString {

	public static void main(String[] args) {
		 String str = "LevEL", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }

	}

}
/* In the above example, we have a string "Radar" stored in str. Here, we have used the

1. for loop to reverse the string

The loop runs from the end to the beginning of the string.
The charAt() method accesses each character of the string.
Each character of the string is accessed in reverse order and stored in reverseStr.
2. if statement to compare str and reverseStr

The toLowerCase() method converts both str and reverseStr to lowercase. This is because Java is case sensitive and 'r' and 'R' are two different values.
The equals() method checks if two strings are equal.
*/
