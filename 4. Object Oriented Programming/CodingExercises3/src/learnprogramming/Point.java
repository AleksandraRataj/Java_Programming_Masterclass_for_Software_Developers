package learnprogramming;

public class Point {

    public static void main(String[] args) {

        Point firstPoint = new Point(6, 5);
        Point secondPoint = new Point(3, 1);
        System.out.println("distance(0,0) = " + firstPoint.distance());
        System.out.println("distance(2,2) = " + firstPoint.distance(2, 2));
        System.out.println("oistance(second) = " + firstPoint.distance(secondPoint));
        Point thirdPoint = new Point();
        System.out.println("distance() = " + thirdPoint.distance());

    }

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + (Math.pow(this.y - y, 2)));
    }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }
}
