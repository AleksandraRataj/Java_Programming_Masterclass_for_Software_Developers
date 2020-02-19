public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(1, 15, 99));
        System.out.println(isTeen(23));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){

        return firstNumber >= 13 && firstNumber <= 19 ||
                secondNumber >= 13 && secondNumber <= 19 ||
                thirdNumber >= 13 && thirdNumber <= 19;
    }

    public static boolean isTeen(int number){

        return number >= 13 && number <= 19;
    }
}
