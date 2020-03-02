package learnprogramming;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    public void setSecondNumber(double value) {
        this.secondNumber = value;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubstractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }
    }
}
