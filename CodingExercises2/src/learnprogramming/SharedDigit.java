package learnprogramming;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(13,31));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstNrDigit = firstNumber % 10;
        int secondNrDigit = secondNumber % 10;

        firstNumber /= 10;
        secondNumber /= 10;

        if (firstNrDigit == secondNrDigit || firstNumber == secondNrDigit || secondNumber == firstNumber) {
            return true;
        } else {
            return false;
        }
    }
}
