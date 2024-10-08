import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]
        String[] orders = {"first", "second", "third", " "};
        orders[3] = orders[0];
        orders[0] = orders[2];
        orders[2] = orders[3];
        orders[3] = "";

        System.out.println(Arrays.toString(orders));

    }
}
