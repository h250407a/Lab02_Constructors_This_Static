// Demonstrates auto-incrementing static IDs, constructor overloading, and copy constructor.
class Employee {
    private static int nextId = 1000;
    private final int employeeId;
    private String name;
    private String department;
    private double salary;

    // Instance initializer generates auto-incrementing employeeId
    {
        this.employeeId = ++nextId;
    }

    // Constructor 1: Full specification
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor 2: Default salary
    public Employee(String name, String department) {
        this(name, department, 3000.0);
    }

    // Constructor 3: Name only, default department and salary
    public Employee(String name) {
        this(name, "General", 2500.0);
    }

    // Copy Constructor: copies attributes of another employee while generating a unique ID
    public Employee(Employee other) {
        this(other.name, other.department, other.salary);
    }

    public void display() {
        System.out.printf("Employee #%d: %s | Dept: %s | Salary: $%.2f%n",
                employeeId, name, department, salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai Sithole", "IT Support", 4200.0);
        Employee e2 = new Employee("Nyasha Moyo", "Human Resources");
        Employee e3 = new Employee("Kudzai Shumba");
        Employee e4 = new Employee(e1); // Copied employee

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
