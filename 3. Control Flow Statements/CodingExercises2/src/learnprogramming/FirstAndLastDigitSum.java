package learnprogramming;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(121));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = number % 10;

        while (number != 0) {

            if (number < 10) {

                sum += (number % 10);
            }
            number /= 10;
        }
        return sum;
    }
}
