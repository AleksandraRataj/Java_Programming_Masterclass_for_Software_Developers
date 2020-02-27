package learnprogramming;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int sum = 0;
        int counter = 1;

        while (counter <= 10){

            System.out.print("Enter number #" + counter + ": ");
            boolean hasNextint = scan.hasNextInt();
            if(hasNextint){
                counter++;
                number = scan.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid value!");
            }
        }
        System.out.println("The sum of your numbers = " + sum);
        scan.close();
    }
}
