package learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this.name = "Default name";
        this.creditLimit = 0;
        this.emailAddress = "Default email address";
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email address");
    }

    public VipCustomer(String name, double getCreditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
