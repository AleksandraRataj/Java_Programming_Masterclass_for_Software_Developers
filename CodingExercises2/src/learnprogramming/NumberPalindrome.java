package learnprogramming;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234554321));
    }

    public static boolean isPalindrome(int number) {

        int n = number;
        int lastDigit = 0;
        int reverse = 0;

        while (n != 0) {

            lastDigit = n % 10;
            n /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }

        return number == reverse;
    }
}
