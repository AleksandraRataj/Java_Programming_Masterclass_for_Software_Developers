package learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] myDoubleArray = new double[10];

//        myIntArray[4] = 50;
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[7]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " - value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / (double) array.length;
    }
}
