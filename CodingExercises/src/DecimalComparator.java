public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(1.15912, 1.15943));
        System.out.println(areEqualByThreeDecimalPlaces(1.098, 1.2344));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        int firstNumberInteger = (int) firstNumber;
        int secondNumberInteger = (int) secondNumber;

        return firstNumberInteger == secondNumberInteger;
    }
}
