package Strings;

public class reverseString {

	public static void main(String[] args) {
		String str = "Shubam khare";
		String rev = "";
		for (int i=0; i< str.length();i++) {
			rev=  str.charAt(i)+ rev ;
		//	rev= rev +  str.charAt(i) ;
		}
		System.out.println("The Reverse of the String is:" +rev);
		
	}

}

// rev = S
// rev = h+ S --> hS
//rev = u + hS --> uhS
//rev = b + uhs --> buhS
