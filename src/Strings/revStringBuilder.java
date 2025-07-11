package Strings;

public class revStringBuilder {

	public static void main(String[] args) {
		String str = "APAP AAM";
		StringBuilder rev = new StringBuilder();
		// append a string into StringBuilder rev
		rev.append(str);
		
		// reverse StringBuilder rev
		rev.reverse();
		
		 // print reversed String
		System.out.println("The Reverse of the given string is: " +rev);

	}

}
