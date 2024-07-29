package Strings;
/* Remove Leading Zeros From String in Java
 * Input : 00000123569
	Output: 123569

Input: 000012356090
Output: 12356090
 */
public class RemoveLeadZeros {

	public static void main(String[] args) {
		String str = "00000123569";
		
		int index = 0;
		for(int i =0; i<= str.length();i++) {
			char p = str.charAt(i);
			if(p!= '0')
			{   index = i;
				break;
			}
		}
		str = str.substring(index, str.length());
		System.out.println(str);
		

	}

}
