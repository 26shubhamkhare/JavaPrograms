package Strings;

public class reverseEachWord {

	public static void main(String[] args) {
        String str = "It is still day one at Amazon";
        // split the word using split method with spaces
        // store these words into the string array;
        String[] words = str.split(" ");
        // Initialize empty reverse string to store the reverse words
        String revString = ""; 
        for (String word : words) {

            // for-each loop will iterate over all the 'words' through word String variable

            //Initialize empty string revWord which will store all characters of word in reverse order.
            String revWord = "";
            for (int i = word.length() - 1; i >= 0; i--)
            // This for-loop will iterate through each char of the words
            { 
                // Store the Reverse character of the word in the String revWord
                revWord += word.charAt(i);

            }
            //Store all reverse words in a string
            revString = revString + revWord + " ";
        }
        System.out.println(revString);

    }

}

/*  
split the word using split method with spaces
store these words into the string array;
Initialize empty reverse string to store the reverse words
for-each loop will iterate over all the 'words' through word String variable
Initialize empty string revWord which will store all characters of word in reverse order.
This for-loop will iterate through each char of the words
Store the Reverse character of the word in the String revWord
Store all reverse words in a string 
*/
