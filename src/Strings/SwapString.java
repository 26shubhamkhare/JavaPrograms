package Strings;

public class SwapString {

	public static void main(String[] args) {
		
		String a ="Shubham";
		String b= "Khare";
		
		a = a+b; // ShubhamKhare
		// Now I want string a value in string b which is shubham
		
		b= a.substring(0,a.length()-b.length()); //Shubham
		
		a = a.substring(b.length()); // Khare
		
		System.out.println("String After Swap: " + a + " " + b);
		
		

	}

}
