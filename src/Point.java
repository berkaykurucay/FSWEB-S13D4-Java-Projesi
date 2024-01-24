public class Point {

    // Instance variables
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    // Getter and setter methods
    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    // Distance method overloading
    public double distance() {
        // Distance from the origin (0,0)
        return Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
    }

    public double distance(Point p) {
        // Distance from another Point object
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }

    public double distance(int a, int b) {
        // Distance from specified coordinates (a, b)
        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }

    public static void main(String[] args) {
        // Creating Point objects
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point(0, 0);

        // Testing distance methods
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        System.out.println("distance()= " + point.distance());
    }
}
