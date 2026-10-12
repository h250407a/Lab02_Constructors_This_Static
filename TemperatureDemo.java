// Demonstrates static factory methods as a clean alternative to ambiguous constructors.
class Temperature {
    // Internal temperature stored in Celsius
    private final double celsius;

    // Private constructor blocks direct instantiation from outside
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Static factory for Celsius
    public static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    // Static factory for Fahrenheit: converts to Celsius internally
    public static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32.0) * 5.0 / 9.0);
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public void display() {
        System.out.printf("Temperature: %.2f °C | %.2f °F%n", getCelsius(), getFahrenheit());
    }
}

public class TemperatureDemo {
    public static void main(String[] args) {
        System.out.println("--- Static Factory Methods Demo ---");
        // Static factories give clear intent that cannot be achieved with two constructors taking 'double'
        Temperature roomTemp = Temperature.fromCelsius(25.0);
        Temperature bodyTemp = Temperature.fromFahrenheit(98.6);

        roomTemp.display();
        bodyTemp.display();

        System.out.println("\nWhy static factories are clearer than constructors:");
        System.out.println("1. Both Celsius and Fahrenheit take a single double parameter, which Java constructors cannot overload due to identical signatures.");
        System.out.println("2. The factory method names 'fromCelsius' and 'fromFahrenheit' clearly document the units being provided.");
    }
}
