package learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        BankAccount secondAccount = new BankAccount(12345, 100.99, "Aleksandra Rataj", "mail@g.com", 999000999);
        System.out.println("Owner of the account = " + secondAccount.getCustomerName());
        account.setCustomerName("Ola");
        account.setNumber(123456789);
        account.setBalance(0.00);
        account.setEmail("myemail@gmail.com");
        account.setPhoneNumber(123345567);

        account.withdrawalFunds(100.00);

        account.depositFunds(50.55);
        account.withdrawalFunds(100.00);

        account.depositFunds(51);
        account.withdrawalFunds(100);

        BankAccount timsAccount = new BankAccount(12345, 101010.00, "Tim", "tim@g.com");
        System.out.println("Name = " + timsAccount.getCustomerName() + ", phone number = " + timsAccount.getPhoneNumber());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 1000.99, "tim@g.com");
        System.out.println(person3.getName());
    }
}
