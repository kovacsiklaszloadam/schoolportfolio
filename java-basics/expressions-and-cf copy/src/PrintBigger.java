import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13

        Scanner x = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int firstNumber = x.nextInt();

        System.out.println("Please enter a number: ");
        int secondNumber = x.nextInt();

                if (firstNumber > secondNumber) {
                    System.out.println(firstNumber);

                } else {
                    System.out.println(secondNumber);
                }

    }
}