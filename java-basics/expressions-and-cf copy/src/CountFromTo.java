import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers. If the second number
        // is not greater than the first the program should print:
        // "The second number should be bigger"
        //
        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        //
        // Example:
        //
        // Please enter the first number: 3
        // Please enter the second number: 6
        // 3
        // 4
        // 5
        Scanner number = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNumber = number.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNumber = number.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println("The second number should be bigger");
        } else {
            while (firstNumber != secondNumber) {
                --secondNumber;
                System.out.println(secondNumber);
            }
        }

    }
}