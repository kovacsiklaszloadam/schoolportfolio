public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
        // but for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        int x = 1;

        while (x <= 100) {
            if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");
                ++x;

            } else if (x % 3 == 0) {
                System.out.println("Fizz");
                ++x;

            } else if (x % 5 == 0) {
                System.out.println("Buzz");
                ++x;

            } else {
                System.out.println(x);
                ++x;

            }
        }

    }
}