public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10

        a += 10;

        System.out.println(a);

        int b = 100;
        // decrease the value of b by 7

        b -= 7;

        System.out.println(b);

        int c = 44;
        // double the value of c

        c *= 2;
        System.out.println(c);

        int d = 125;
        // divide the value of d by 5

        d /= 5;
        System.out.println(d);

        int e = 8;
        // cube the value of e

        e = e * e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)

        boolean greater1 = (f1 > f2);
        System.out.println(greater1);

        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)

        boolean greater2 = ((g2 * 2) > g1);
        System.out.println(greater2);

        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)

        int remainder = h / 11;
        boolean divisible = remainder == 0;
        System.out.println(divisible);

        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)

        int i2Square = i2 * i2;
        int i2Cubed = i2 * i2 * i2;
        System.out.println(i1 > i2Square && i1 < i2Cubed);

        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)

        int divisibleThree = (j % 3);
        int divisibleFive = (j % 5);
        boolean divisibleBy3or5 = (divisibleFive == 0 || divisibleThree == 0);
        System.out.println(divisibleBy3or5);
    }
}