package learnprogramming;

public class Main {

    public static void main(String[] args) {

        BasicBurger burger = new BasicBurger("Basic", "white", "Sausage", 3.56);
        double price = burger.itemizeBurger();
        burger.addBurgerAddition1("tomato", 0.25);
        burger.addBurgerAddition2("lettuce", 0.75);
        burger.addBurgerAddition3("cheese", 1.17);
        System.out.println("Total burger price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 3.25);
        healthyBurger.addHealthAddition2("Lettuce", 0.75);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addBurgerAddition1("tomato", 0.25);
        deluxeBurger.itemizeBurger();
    }
}



