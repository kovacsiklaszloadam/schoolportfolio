import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Write a function called `sum()` that returns the sum of numbers from zero
        // to the given parameter
        //
        // Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the parameter: ");
        int parameter = sc.nextInt();

        int sum = sum(parameter);
        System.out.println(sum);
    }
        public static int sum(int parameter){
        int sum = 0;
            for (int i = 0; i < parameter +1; i++) {
                 sum += i;

            }return sum;



    }
}
