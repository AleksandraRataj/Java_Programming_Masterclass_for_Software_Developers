package learnprogramming;

public class isEvenNumber {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(-1));

        int startNumber = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (startNumber <= finishNumber) {
            startNumber++;

            if (!isEvenNumber(startNumber)) {
                continue;
            }

            evenNumbersFound++;
            System.out.println("Even number = " + startNumber);

            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
