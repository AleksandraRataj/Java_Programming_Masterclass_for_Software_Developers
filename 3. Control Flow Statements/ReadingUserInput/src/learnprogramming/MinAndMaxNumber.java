package learnprogramming;

import java.util.Scanner;

public class MinAndMaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int max = 0;
        int min = 0;
        boolean first = true;

        while (true) {

            System.out.print("Enter number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {

                number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        scanner.close();
    }
}
