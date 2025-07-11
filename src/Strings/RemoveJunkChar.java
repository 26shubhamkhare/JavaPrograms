package Strings;

public class RemoveJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$@$@$#%@ lalaLALA 3234242";
		String str = "$@$@$#%@ lalaLALA 3234242";

		// ^ this symbol means: except this whatever is their in bracket replace all of them 
		s = s.replaceAll("[a-zA-Z0-9]", ""); // a-zA-Z will be removed
		str = str.replaceAll("[^a-zA-Z]", ""); // Here except [^a-zA-Z] all will removed becoz of '^' this symbol
		
		System.out.println(s);
		System.out.println(str);
		
		

	}

}
