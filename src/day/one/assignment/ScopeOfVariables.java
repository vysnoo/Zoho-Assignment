package day.one.assignment;

public class ScopeOfVariables {
    static int staticCount;

    int instanceCount;

    final int finalValue;

    public ScopeOfVariables(int value) {
        this.finalValue = value;
    }

    public void demonstrateScopes() {
        int localCount = 100;

        System.out.println("Local variable: " + localCount);
        System.out.println("Instance variable: " + instanceCount);
        System.out.println("Static variable: " + staticCount);
        System.out.println("Final variable: " + finalValue);

        // Block scope variable
        if (true) {
            int blockVariable = 50;
            System.out.println("Block variable inside if block: " + blockVariable);
        }
        // Uncommenting the below line will give an error as blockVariable is out of scope
        // System.out.println(blockVariable); // Error: Cannot find symbol
    }
    public static void main(String[] args) {
        ScopeOfVariables obj1 = new ScopeOfVariables(10);
        ScopeOfVariables obj2 = new ScopeOfVariables(20);

        obj1.instanceCount = 1;
        obj2.instanceCount = 2;

        ScopeOfVariables.staticCount = 100;

        System.out.println("---- Object 1 ----");
        obj1.demonstrateScopes();

        System.out.println("---- Object 2 ----");
        obj2.demonstrateScopes();
    }
}
