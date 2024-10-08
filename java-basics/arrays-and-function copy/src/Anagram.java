import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // Create a function named isAnagram() following your current language's style guide. It should take two strings
        // and return a boolean value depending on whether it's an anagram or not.

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean isAnagram = false;

        if (a.length() != b.length()) {
            isAnagram = false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (b.contains(String.valueOf(a.charAt(i)))) {
                isAnagram = true;
            } else isAnagram = false;
        }
        return isAnagram;

    }

}
