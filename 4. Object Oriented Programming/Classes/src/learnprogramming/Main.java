package learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porshe = new Car();
        Car holden = new Car();

        //porshe.model = "Carrera"; //if model is public

        porshe.setModel("Carrera");
        System.out.println("Model is " + porshe.getModel());

    }
}
