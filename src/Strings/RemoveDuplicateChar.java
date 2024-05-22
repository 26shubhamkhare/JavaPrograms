package Strings;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
	
/*	static void remove(String s)
	{
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i=0; i< s.length(); i++)
		{
			set.add(s.charAt(i));
			
		}	
			for(Character ch : set) 
				System.out.print(ch);
			
		
		

	}
	public static void main(String[] args) {
		//Program to remove the duplicate Characters from the String
		String s = "Shubham Baba";
		remove(s);
		

}
} */
	
	/*  static void removeDuplicates(String LowerCase)   
	    {     
	        //Create LinkedHashSet of type character   
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<LowerCase.length();i++)   
	            set.add(LowerCase.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        
	    //main() method start  
	    public static void main(String args[])   
	    {   
	        //Create string variable with default value  
	        String str = "AaBb baba"; 
            String LowerCase = str.toLowerCase();
	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(LowerCase);   
	    }   
	}  */
	
	
	
		
		
			
		
		

	
	public static void main(String[] args) {
		//Program to remove the duplicate Characters from the String
		String s = "Shubham Aabba";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i=0; i< s.length(); i++)
		{
			// Add all the Chars to the SET so that it will remove the duplicate
			set.add(s.charAt(i));
			
		}	
			for(Character ch : set) 
				System.out.print(ch);
		

}
} 

	

	
