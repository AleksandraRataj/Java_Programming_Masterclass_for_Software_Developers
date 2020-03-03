package learnprogramming;

public class DeluxeBurger extends BasicBurger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 14.50);
        super.addBurgerAddition1("Chips", 2.75);
        super.addBurgerAddition2("Drink", 1.52);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
