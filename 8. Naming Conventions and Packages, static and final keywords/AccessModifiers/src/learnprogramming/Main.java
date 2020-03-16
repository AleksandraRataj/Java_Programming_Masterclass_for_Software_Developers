package learnprogramming;

public class Main {

    public static void main(String[] args) {

        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();

//        timsAccount.balance = 5000; ERROR

        System.out.println("Balance on account is " + timsAccount.getBalance());
    }
}
