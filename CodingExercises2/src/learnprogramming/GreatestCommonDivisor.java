package learnprogramming;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,30));
    }

    //Algorytm Euklidesa
    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){
            return -1;
        }

        int dzielona = first;
        int dzielnik = second;

        int reszta =  dzielona % dzielnik;


        while (reszta != 0){

            dzielona = dzielnik;
            dzielnik = reszta;
            reszta =  dzielona % dzielnik;
        }

        return dzielnik;
    }
}
