package learnprogramming;

public class ComplexNumber {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.substract(two);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        two.substract(one);
        System.out.println("two.real = " + two.getReal());
        System.out.println("two.imaginary = " + two.getImaginary());

    }

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double r, double i) {
        real += r;
        imaginary += i;
    }

    public void substract(double r, double i) {
        real -= r;
        imaginary -= i;
    }

    public void substract(ComplexNumber number) {
        real -= number.real;
        imaginary -= number.imaginary;
    }
}
