package learnprogramming;

public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(00000, 00.00, "Default name", "Default email", 000000000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String email) {
        this(number, balance, customerName, email, 999000999);
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("BankAccount constructor with parameters called");
    }


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
