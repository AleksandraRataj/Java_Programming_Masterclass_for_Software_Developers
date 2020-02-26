package learnprogramming;

public class Main {

    public static void main(String[] args) {

        double meal_cost = 12.00;
        int tip_percent = 20;
        int tax_percent = 8;

        double tip = (meal_cost *tip_percent)/100;
        System.out.println(tip);
        double tax = (meal_cost * tax_percent)/100;
        System.out.println(tax);
        int totalCost = (int) Math.round(meal_cost + tip + tax);

        System.out.println(totalCost);
    }
}
