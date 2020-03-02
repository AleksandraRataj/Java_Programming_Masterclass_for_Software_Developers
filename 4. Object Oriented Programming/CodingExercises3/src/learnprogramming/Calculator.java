package learnprogramming;

//for classes Floor.java nad Carpet.java

public class Calculator {

    public static void main(String[] args) {

        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

        Floor floor2 = new Floor(5.4, 4.5);
        Carpet carpet2 = new Carpet(1.5);
        calculator = new Calculator(floor2, carpet2);
        System.out.println("total = " + calculator.getTotalCost());

    }

    Floor floor;
    Carpet carpet;

    public Calculator(Floor f, Carpet c) {
        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
