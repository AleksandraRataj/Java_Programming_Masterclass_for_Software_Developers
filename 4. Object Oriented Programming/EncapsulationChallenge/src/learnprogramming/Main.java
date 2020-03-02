package learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        System.out.println("Initial page count = " + printer.getPrintedPages());
        int pagesPrinted = printer.printing(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());
        pagesPrinted = printer.printing(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());
        printer.fillUpToner(20);
        System.out.println("Current toner level - " + printer.getTonerLevel());
    }
}
