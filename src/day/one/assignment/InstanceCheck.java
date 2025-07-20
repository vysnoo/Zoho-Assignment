package day.one.assignment;
// An instance is just an object created from a class.

class Animal {
    // Super class, Parent class, Base Class
}

class Dog extends Animal {
    // Subclass , Child , Derived class
}

public class InstanceCheck {

    public static void main(String[] args) {
        Animal a = new Dog();  // Creating a Dog object using Animal reference

        if (a instanceof Dog) {
            System.out.println("Object 'a' is an instance of Dog.");
        } else {
            System.out.println("Object 'a' is NOT an instance of Dog.");
        }

        if (a instanceof Animal) {
            System.out.println("Object 'a' is also an instance of Animal.");
        }

        if (a instanceof Object) {
            System.out.println("Object 'a' is an instance of Object class (base of all classes).");
        }
    }
}
