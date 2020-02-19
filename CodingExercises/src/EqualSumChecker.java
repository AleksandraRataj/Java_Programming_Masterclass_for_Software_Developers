public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,2,4));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sum){

        return(firstNumber + secondNumber) == sum;
    }

}
