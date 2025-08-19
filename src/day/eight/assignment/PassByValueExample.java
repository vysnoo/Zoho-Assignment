package day.eight.assignment;

class NumberBox {
    int value;

    NumberBox(int value) {
        this.value = value;
    }
}

public class PassByValueExample {

    // Method with primitive parameter
    static void changePrimitive(int x) {
        x = 50; // modifies local copy only
    }

    // Method with object parameter
    static void changeObject(NumberBox box) {
        box.value = 99; // modifies the object's field (through reference copy)
    }

    // Method with reassigning object reference
    static void reassignObject(NumberBox box) {
        box = new NumberBox(500); // new object assigned to local copy
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changePrimitive: a = " + a);
        changePrimitive(a);
        System.out.println("After changePrimitive: a = " + a); // still 10

        NumberBox nb = new NumberBox(20);
        System.out.println("\nBefore changeObject: nb.value = " + nb.value);
        changeObject(nb);
        System.out.println("After changeObject: nb.value = " + nb.value); // changed to 99

        System.out.println("\nBefore reassignObject: nb.value = " + nb.value);
        reassignObject(nb);
        System.out.println("After reassignObject: nb.value = " + nb.value); // still 99
    }
}
