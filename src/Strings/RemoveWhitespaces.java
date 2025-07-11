package Strings;
// Brutre force
public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "It is still day one at Amazon";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //NOTE: use single quote while comparing char otherwise if you use double quotes it will give you an error.
            if (c != ' ' ) {
                result.append(c);
            }
        }
        System.out.println("After removing spaces:" + result.toString());
    }
}
