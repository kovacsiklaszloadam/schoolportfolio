public class Main {
    public static void main(String[] args) {
    }

    public int sumDigit(int n) {

        // Given a non-negative integer n, return the sum of its digits recursively
        // (without loops).

        if (n == 0) {
            return 0;

        }
        return (n % 10 + sumDigit(n / 10));
    }

    public int powerOf(int base, int n) {

        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

        if (n <= 0 || base <= 0) {

            return 1;
        }

        return (base * powerOf(base, n - 1));
    }

    public int numberAdder(int n) {

        // Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
        // and returns the sum of integers from 1 to n.
        // The function should return 0 for inputs less than 1.

        if (n < 1) {

            return 0;
        } else {

            return n + numberAdder(n - 1);
        }
    }

    public int bunnies(int n) {

        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)

        if (n < 1) {

            return 0;
        } else {

            return bunnies(n - 1) + 2;
        }
    }

    public int bunniesAgain(int n) {

        // We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
        // (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
        // (2, 4, ...) have 3 ears each (because they have a raised foot). Write
        // a recursive method which accepts the number of bunnies as a parameter
        // and returns the total number of "ears" in the bunny line. The method should be
        // able to handle invalid input (e.g. negative numbers).

        if(n < 1) {

            return 0;
        } else if (n % 2 == 0) {

            return bunniesAgain(n - 1) + 3;
        } else {
            return bunniesAgain(n - 1) + 2;
        }
    }

    public String strings(String s, int index) {

        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.

        while (index < s.length()) {

            if (s.charAt(index) != 'x') {

                return strings(s, index + 1);
            } else

                return strings(s.replace(s.charAt(index), 'y'), index + 1);
        }

        return s;
    }

    public String stringsAgain(String s, int index) {

        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.

        while (index < s.length()) {

            if (s.charAt(index) != 'x') {

                return stringsAgain(s, index + 1);
            } else

                return stringsAgain(s.replace(String.valueOf(s.charAt(index)), ""), index + 1);
        }

        return s;
    }

    public String stringsAgainAndAgain(StringBuilder sb, int index) {

        // Given a string, write a recursive (no loops) method which returns a new
        // string with all adjacent chars separated by an `*`. Please note that there
        // should be no trailing `*` at the end of the returned string. For example,
        // the string `word` should be changed to `w*o*r*d`.

        while (index < sb.length() - 1) {

            if (sb.charAt(index) != '*') {

                return stringsAgainAndAgain(sb.insert(index + 1, '*'), index + 1).toString();
            } else

                return stringsAgainAndAgain(sb, index + 1).toString();
        }

        return sb.toString();
    }
}