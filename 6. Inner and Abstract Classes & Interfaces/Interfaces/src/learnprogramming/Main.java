package learnprogramming;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234556);
        timsPhone.powerOn();
        timsPhone.callPhone(1234556);
        timsPhone.answer();

        timsPhone = new MobilePhone(987654);
        timsPhone.powerOn();
        timsPhone.callPhone(987654);
        timsPhone.answer();

    }
}
