// Demonstrates constructors, constructor chaining with this(), static fields, and initializer blocks.
public class Book {
    private static int count = 0;
    private final int id;
    private String title;
    private String author;
    private double price;

    static {
        System.out.println("Book class loaded");
    }

    {
        count++;
        id = count;
    }

    // Constructor 1: full initialisation
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor 2: constructor chaining with this(...)
    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    // Constructor 3: no-argument constructor
    public Book() {
        this("Untitled", "Unknown");
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.printf("#%d %s by %s ($%.2f)%n", id, title, author, price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin", 39.99);
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book();

        b1.display();
        b2.display();
        b3.display();
        System.out.println("Total books created: " + Book.getCount());
    }
}
