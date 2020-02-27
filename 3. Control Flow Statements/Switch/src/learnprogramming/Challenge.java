package learnprogramming;

public class Challenge {

    public static void main(String[] args) {

        char charVariable = 'A';

        switch(charVariable){

            case 'A':
                System.out.println("That was A");
                break;
            case 'B':
                System.out.println("That was B");
                break;
            case 'C':
                System.out.println("That was C");
                break;
            case 'D':
                System.out.println("That was D");
                break;
            case 'E':
                System.out.println("That was E");
                break;
            default:
                System.out.println("Nothing found!");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "j une":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
