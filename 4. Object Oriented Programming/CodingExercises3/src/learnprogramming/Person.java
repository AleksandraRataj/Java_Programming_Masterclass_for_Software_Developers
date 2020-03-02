package learnprogramming;

public class Person {

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("Aleksandra");
        person.setLastName("Rataj");
        person.setAge(21);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(17);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());

    }

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {

        if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else {
            return firstName + " " + lastName;
        }
    }
}
