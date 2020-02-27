package learnprogramming;

public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(1, 0, -4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigCountNeeded = Math.min(goal/5, bigCount);
        int smallCountNeeded = goal - bigCountNeeded * 5;

        return  bigCount >= bigCountNeeded && smallCount >= smallCountNeeded;
    }
}
