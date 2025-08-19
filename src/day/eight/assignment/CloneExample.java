package day.eight.assignment;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Students implements Cloneable {
    int id;            // primitive
    String name;       // reference (but immutable in Java)
    Address address;   // reference (mutable)

    Students(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class CloneExample {
    public static void main(String[] args) throws Exception {

        Address addr = new Address("Chennai");
        Students s1 = new Students(101, "Vishnu", addr);

        Students s2 = (Students) s1.clone(); // Shallow copy

        // Show initial values
        System.out.println("Before changes:");
        System.out.println("s1: id=" + s1.id + ", name=" + s1.name + ", city=" + s1.address.city);
        System.out.println("s2: id=" + s2.id + ", name=" + s2.name + ", city=" + s2.address.city);

        // Modify primitive in s2
        s2.id = 202;

        // Modify reference (mutable object)
        s2.address.city = "Salem";

        // Modify reference (immutable string) -> new object created
        s2.name = "Kumar";

        System.out.println("\nAfter changes in s2:");
        System.out.println("s1: id=" + s1.id + ", name=" + s1.name + ", city=" + s1.address.city);
        System.out.println("s2: id=" + s2.id + ", name=" + s2.name + ", city=" + s2.address.city);
    }
}

// Telusko Video Not Poper - clone video but usefull
// It is deep copy for only primitive datatypes not reference datatypes like Address class above
// for referecnce datatypes it is shallow copy
