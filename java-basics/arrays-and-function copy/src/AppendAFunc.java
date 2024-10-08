public class AppendAFunc {
    public static void main(String[] args) {
        // - Create a string variable named `typo` and assign it the value of
        // `Chinchill`
        // - Write a function called `appendA()` that takes a string as an input,
        // appends the character 'a' at the end and returns the modified string
        // - Print the result of `appendA(typo)`
        String typo = "Chinchill";
        String corrected = appendA(typo);
        System.out.println(corrected);
    }

    public static String appendA(String typo) {
        return typo + 'a';

    }
}
