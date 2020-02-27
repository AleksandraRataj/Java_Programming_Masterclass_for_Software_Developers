package learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int counter = 0;

        while(true){

            System.out.print("Enter number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){

                number = scanner.nextInt();
                sum += number;
                counter++;

            } else{
                break;
            }
        scanner.nextLine();
        }
        double avg = sum / (double)counter;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
}
