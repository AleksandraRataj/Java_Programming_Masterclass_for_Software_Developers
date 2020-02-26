package learnprogramming;

public class DigitSum {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in 125 is: " + sumDigits(125));
        System.out.println("The sum of the digits in -125 is: " + sumDigits(-125));
        System.out.println("The sum of the digits in 4 is: " + sumDigits(4));
        System.out.println("The sum of the digits in 123456789 is: " + sumDigits(123456789));
    }

    public static int sumDigits(int number) {

        if (number < 10)
            return -1;

        int digit = 0;
        int sum = 0;

        while (number > 0) {

            digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
}
