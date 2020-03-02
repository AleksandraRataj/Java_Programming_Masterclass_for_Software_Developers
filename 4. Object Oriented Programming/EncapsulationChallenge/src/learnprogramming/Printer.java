package learnprogramming;

public class Printer {

    private int tonerLevel = 100;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.printedPages = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printing(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
