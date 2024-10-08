public class PrintEven {
    public static void main(String[] args) {
        // Create a program that prints all even numbers between 0 and 500 (both included)
        // Each number should be on a new line
        int x = 0;

        while (x <= 500) {
            if (x % 2 == 0) {
                System.out.println(x);
                ++x;
            }else {
                ++x;
            }
        }
    }
}