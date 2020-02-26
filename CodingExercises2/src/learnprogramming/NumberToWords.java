package learnprogramming;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(1234567890);
    }

    public static void numberToWords(int number){

        number = reverse(number);
        if(number < 0){
            System.out.println("Invalid Value");
        } else {

            int lastDigit;

            while(number != 0) {

                lastDigit = number % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.print("zero ");
                        break;
                    case 1:
                        System.out.print("one ");
                        break;
                    case 2:
                        System.out.print("two ");
                        break;
                    case 3:
                        System.out.print("three ");
                        break;
                    case 4:
                        System.out.print("four ");
                        break;
                    case 5:
                        System.out.print("five ");
                        break;
                    case 6:
                        System.out.print("six ");
                        break;
                    case 7:
                        System.out.print("seven ");
                        break;
                    case 8:
                        System.out.print("eight ");
                        break;
                    case 9:
                        System.out.print("nine ");
                        break;
                }
                number /= 10;
            }
        }
    }

    public static int reverse(int number){

        int lastDigit;
        int reverse = 0;

        while (number != 0){

            lastDigit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += lastDigit;

        }

        return reverse;
    }
}
