package learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 10, 15, 150};
        System.out.println("array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("reversedArray = " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
