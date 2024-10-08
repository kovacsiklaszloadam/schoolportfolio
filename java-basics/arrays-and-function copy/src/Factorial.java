import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input
        //
        // - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num1 = sc.nextInt();
        int factorial = calculateFactorial(num1);

        System.out.println(factorial);
    }
    public static int calculateFactorial(int num1){
        int factorial = 1;
        for (int i = 1; i <num1 +1; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
