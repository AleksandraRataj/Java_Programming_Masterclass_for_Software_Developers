package learnprogramming;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(12, 234, 444));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aDigit = a % 10;
        int bDigit = b % 10;
        int cDigit = c % 10;

        return aDigit == bDigit || aDigit == cDigit || bDigit == cDigit;
    }

    public static boolean isValid(int number) {

        return number >= 10 && number <= 1000;

    }


}
