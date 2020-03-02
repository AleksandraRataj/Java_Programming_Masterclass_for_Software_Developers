package learnprogramming;

public class BankAccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
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
    }

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdrawalFunds(double amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }
    }
}
