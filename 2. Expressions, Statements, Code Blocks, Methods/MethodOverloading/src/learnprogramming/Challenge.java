package learnprogramming;

public class Challenge {

    public static void main(String[] args) {

        calcfeetAndInchesToCentimeters(2, 5);
        calcfeetAndInchesToCentimeters(-1, 13);
        calcfeetAndInchesToCentimeters(0, 1);

        calcfeetAndInchesToCentimeters(100);
        calcfeetAndInchesToCentimeters(-10);
    }

    public static double calcfeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = (feet * 12) * 2.54 + inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters!");
            return -1;
        }
    }

    public static double calcfeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcfeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            System.out.println("Invalid inches parameter!");
            return -1;
        }
    }
}
