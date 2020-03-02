package learnprogramming;

public class SumCalculator {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(100.123);
        calculator.setSecondNumber(55.55);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubstractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        calculator.setSecondNumber(0);
        System.out.println("divide = " + calculator.getDivisionResult());

    }

}
