package Strings;
/* Remove Leading Zeros From String in Java
 * Input : 00000123569
	Output: 123569

Input: 000012356090
Output: 12356090
 */
public class RemoveLeadZeros {

	public static void main(String[] args) {
		String str = "00000021023569";
		
		int index = 0;
		for(int i =0; i<= str.length();i++) {
			if(str.charAt(i) != '0')
			{   index = i;
				break;
			}
		}
		str = str.substring(index);
		System.out.println(str);
		

	}

}

/*Approach:
1. find out the index where index string char != '0' and then set index = i; and break;
2. Use substring(index);
 */
