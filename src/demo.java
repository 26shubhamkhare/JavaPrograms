import java.util.HashSet;

import Strings.reverseString;

public class demo {
    // reverse only last word
    public static void main(String[] args) {
       //wap to remove duplicate character
       String str = "AAABBBBB";
       HashSet<Character> set = new HashSet<>();
       for(int i=0;i<str.length();i++)
       {
        set.add(str.charAt(i));
       }
       for(Character ch : set)
       {
        System.out.print(ch);
       }

    }

}


