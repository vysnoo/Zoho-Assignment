package day.one.assignment;

public class StaticAndInitializerBlock {
    static {
        System.out.println("Static block executed.");
    }

    // Instance initializer block (executes every time an object is created)
    {
        System.out.println("Instance initializer block executed.");
    }

    // Constructor
    public StaticAndInitializerBlock() {
        System.out.println("Constructor executed.");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");

        System.out.println("Creating first object:");
        StaticAndInitializerBlock obj1 = new StaticAndInitializerBlock();

        System.out.println("Creating second object:");
        StaticAndInitializerBlock obj2 = new StaticAndInitializerBlock();
    }
}

