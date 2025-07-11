package Strings;

public class RemoveLeadZeros1 {

	public static void main(String[] args) {
		String str = "000001235006789";
		// Using StringBuffer
		int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
		
		StringBuffer sb = new StringBuffer(str);
		 sb.replace(0, i, "");
		 str = sb.toString();
		 System.out.println(str);

	}

}
