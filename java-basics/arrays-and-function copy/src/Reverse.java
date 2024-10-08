import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
        Integer[] numbers = {3, 4, 5, 6, 7};

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));

    }
}