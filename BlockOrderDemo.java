// Verifies the order of multiple static blocks versus instance blocks.
public class BlockOrderDemo {
    // Static Block 1
    static {
        System.out.println("Static Block 1 executed (Class loading)");
    }

    // Instance Block 1
    {
        System.out.println("Instance Block 1 executed (Before constructor)");
    }

    // Static Block 2
    static {
        System.out.println("Static Block 2 executed (Class loading)");
    }

    // Instance Block 2
    {
        System.out.println("Instance Block 2 executed (Before constructor)");
    }

    public BlockOrderDemo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("--- Main method started ---");
        System.out.println("Creating First Instance:");
        new BlockOrderDemo();

        System.out.println("\nCreating Second Instance:");
        new BlockOrderDemo();
    }
}
