package learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("________________");

        for (count = 0; count != 5; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("________________");

        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("________________");

        count = 5;
        do {
            System.out.println("Count value is " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 5);
    }
}
