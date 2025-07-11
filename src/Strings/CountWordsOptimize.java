package Strings;

public class CountWordsOptimize {
    public static void main(String[] args) {
        String sentence = "  It  is   still day  one at Amazon for Shubham Khare ";
        if(sentence.trim().isEmpty())
        {
            System.out.println("Word Count:" + 0);
        }
        else{
            String word[] = sentence.trim().split("\\s+");
            int wordCount = word.length;
            System.out.println("The word count is:"+ wordCount);
        }  
    }
}
/*Explanation:
if (sentence.trim().isEmpty()): This condition ensures that if the input string only contains spaces or is completely empty, it returns a word count of 0.
This version handles extra spaces between words and at the beginning or end of the sentence, ensuring accurate word count results. */