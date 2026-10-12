// Demonstrates copy constructors creating deep value copies rather than reference aliases.
public class Point {
    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor: creates an independent object with the same coordinates
    public Point(Point other) {
        this(other.x, other.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1); // Independent copy

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1 and p2 refer to same object? " + (p1 == p2));
    }
}
