package Strings;

public class ReverseSentenceOptimizeApproach {
    public static void main(String[] args) {
        String str = "Hello Python";
        String[] word = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            reversedSentence.append(word[i]);
            if(i>0){
                reversedSentence.append(" ");
            }
        }
        System.out.println("Reverse String:" + reversedSentence);
    }
}
/*Optimized Approach (Using StringBuilder)
A more optimized solution avoids the overhead of repeated string concatenations. Instead of using the + operator inside the loop, we can use StringBuilder to efficiently append words.
This approach also has a time complexity of O(n), but it's more efficient because it avoids the repeated overhead of string creation

using StringBuilder instead of string concatenation */