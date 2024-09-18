package Strings;
// Reverse the sentence or words in the string
public class ReverseSentenceBruteForce {
    public static void main(String[] args) {
        
    String str = "It is still day one at Amazon"; 
    String[] word = str.split(" ");
    String reverseSentence = "";
    for(int i = word.length-1; i>=0;i--){
        reverseSentence+= word[i];

        if(i!=0){
            reverseSentence+= " ";

        }
    }
    // Output the reversed sentence
    System.out.println("Reversed sentence (Brute Force): " + reverseSentence);

}
}
/*This approach has a time complexity of O(n), but the string concatenation inside the loop creates a new string every time, leading to O(n^2) complexity due to repeated copying of strings. */
