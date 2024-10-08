import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a triangle height: ");
        int height = input.nextInt();



    }

    public static void print(int height){
        // Write your code to draw the triangle here

        char asterisk = '*';

        for (int i = 0; i <= height; ++i) {
            System.out.println(i * asterisk);
        }






    }
}