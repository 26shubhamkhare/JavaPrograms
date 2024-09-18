package Strings;
// string is immutable which cannot change
// StringBuffer is mutable and there is reverse function also
public class reverseString {

	public static void main(String[] args) {
		String str = "Shubham Khare";
		String rev = "";
		for (int i=0; i< str.length();i++) {
			rev=  str.charAt(i)+ rev ;
		//rev= rev +  str.charAt(i) ;
//	System.out.println("The Reverse of the String is:" +rev); to see how reverse is happening
		}
		System.out.println("The Reverse of the String is:" +rev);
			}

}

/* rev = S;
  rev = h+ S; --> hS
rev = u + hS; --> uhS
rev = b + uhs; --> buhS */


