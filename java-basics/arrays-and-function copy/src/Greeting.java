import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // - Create a class called Greet
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet()` that greets its input parameter
        //     - It prints a greeting message e.g. `Greetings dear Green Fox`
        // - Greet `al`
        String al = "Green Fox";
        greet(al);

    }
    public static void greet(String al){
        System.out.println("Greetings dear " + al);

    }
}
