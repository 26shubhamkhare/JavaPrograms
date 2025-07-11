package Strings;

public class a2b2c3d2 {
	public static void main(String[] args) {
		String str = "aabbcccddd";
	
		String output = getCharacterCount(str);
		 System.out.println("Output: " + output);
	}
	
	public static String getCharacterCount(String str) {
		StringBuffer sb = new StringBuffer();
		
		int count = 1;
		for(int i=0; i< str.length();i++) {
			if(i+1 < str.length() && str.charAt(i)   == str.charAt(i+1)) {
				count ++;
			}
			else
			{
				sb.append(str.charAt(i)).append(count);
				count =1;
			}
		}
		
		return sb.toString();
		
	}

}
