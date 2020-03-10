package learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 330.24);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 43.33);
        bank.addCustomerTransaction("Adelaide", "Tim", 43.33);
        bank.addCustomerTransaction("Adelaide", "Mike", 433.33);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.54)) {
            System.out.println("Error Melbourne branch does not exist!");
        }
        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists!");
        }
        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 234.44)) {
            System.out.println("Customer does not exist at branch!");
        }
        if (!bank.addCustomer("Adelaide", "Tim", 50.05)) {
            System.out.println("Customer Tim already exists!");
        }
    }
}
