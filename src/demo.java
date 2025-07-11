import Strings.reverseString;

public class demo {
    // reverse only last word
    public static void main(String[] args) {
       String str = "Shubham Khare";
       String rev = "";
       for(int i=str.length()-1;i>=0;i--){
        rev+= str.charAt(i);
       } 
    System.out.println(rev);
    }

}


