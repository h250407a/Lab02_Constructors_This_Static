// Demonstrates constructor overloading and static instance counting with Circle class.
class Circle {
    private static int circleCount = 0;
    private double radius;

    // Overloaded constructor with specified radius
    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }

    // No-argument constructor defaulting radius to 1.0
    public Circle() {
        this(1.0); // Constructor chaining
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static int getCount() {
        return circleCount;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        System.out.println("Initial circle count: " + Circle.getCount());

        Circle c1 = new Circle(4.5);
        Circle c2 = new Circle(); // Uses default 1.0
        Circle c3 = new Circle(7.2);

        System.out.printf("Circle 1 radius: %.2f, Area: %.2f%n", c1.getRadius(), c1.area());
        System.out.printf("Circle 2 radius: %.2f, Area: %.2f%n", c2.getRadius(), c2.area());
        System.out.printf("Circle 3 radius: %.2f, Area: %.2f%n", c3.getRadius(), c3.area());

        System.out.println("Total circles instantiated: " + Circle.getCount());
    }
}
