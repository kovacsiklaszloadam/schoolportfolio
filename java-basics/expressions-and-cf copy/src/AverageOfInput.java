import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = number.nextInt();

        System.out.println("Please enter a number: ");
        int b = number.nextInt();

        System.out.println("Please enter a number: ");
        int c = number.nextInt();

        System.out.println("Please enter a number: ");
        int d = number.nextInt();

        System.out.println("Please enter a number: ");
        int e = number.nextInt();

        System.out.println("Sum: " + (a + b + c + d + e) + ", Average: " + (a + b + c + d + e) / 5);





    }
}