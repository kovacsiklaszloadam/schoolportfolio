import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16
        //

        System.out.println("Please enter the number of chickens: ");
        Scanner scannerChicken = new Scanner(System.in);
        int numberOfChickens = scannerChicken.nextInt();

        System.out.println("Please enter the number of pigs: ");
        Scanner scannerPig = new Scanner(System.in);
        int numberOfPigs = scannerPig.nextInt();

        System.out.println("The number of legs: " + ((numberOfPigs * 4) + (numberOfChickens * 2)));

    }
}