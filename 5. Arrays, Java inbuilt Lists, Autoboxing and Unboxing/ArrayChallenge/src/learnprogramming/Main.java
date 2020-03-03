package learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(10);
        myIntegers = sortIntegers(myIntegers);
        printArray(myIntegers);

    }

    public static int[] getIntegers(int size) {

        System.out.println("Enter " + size + " integer values.");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter #" + i + " value: ");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
