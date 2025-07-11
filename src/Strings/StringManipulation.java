package Strings;

public class StringManipulation {

	public static void main(String[] args) {
		// String Manipulation
		String s = "The rains have started heres is toy";
		
		System.out.println("string length " + s.length());
		System.out.println("Print char at Index " + s.charAt(4));
		System.out.println("Print Index of Char: "+ s.indexOf('s'));
		System.out.println("Print Index of Char: "+ s.indexOf('s', s.indexOf('s')+1)); // 2nd occurence of s
		int thirdS = s.indexOf('s', s.indexOf('s')+1);
		System.out.println("Third occurence of S: " + s.indexOf('s', thirdS+1));
		System.out.println("Print index of word: "+ s.indexOf("have"));
		System.out.println(s.indexOf("Hello")); // it will return -1 becoz hello is not present in string
		
		// String Comparison
		String str = "The rains Have started heres is toy";
		System.out.println("Compare String: "+ str.equals(s)); // FALSE
		System.out.println("Compare String: "+ str.equalsIgnoreCase(s)); // TRUE
		
		// Substring
		System.out.println("Substring method: " + s.substring(0, 9));
		
		//Trim() : it will remove before and after spaces from string
 		String trim = "         Hello World            ";
		System.out.println("Trim Method: " + trim.trim() );
		
		// Now if you want to remove between spaces from Hello World ?
		
		// Replace()
		String replace = "Hello World";
		System.out.println("Removed between Spaces: "+ replace.replace(" ", "Khare"));
		
		String date = "23-05-2024";
		System.out.println("Todays Date: " + date.replace("-", "/"));
		
		//Split method return type is string Array. you cannot store in String variable
		String sp = "Hello_my_Name_is_Shubham";
		//System.out.println("Split method:" + sp.split("_")); error
		String arr[] = sp.split("_");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Split method: " + arr[i]);
		}
		
		// Concat method
		
		String s2 = "Shubham";
		System.out.println("Concatenate string: "+ s2.concat("Khare"));
		
		// String O/p
		String x = "Hello";
		String y = "World";
		int a =100;
		int b = 200;
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
	}

}
