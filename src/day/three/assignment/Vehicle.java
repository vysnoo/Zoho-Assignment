package day.three.assignment;

public class Vehicle {
    int vehicleId;
    String brand;
    int price;
    static int vehicleCount=0;


    Vehicle(int vehicleId,String brand,int price){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.price=price;
        vehicleCount++;
    }

    void display() {
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    static void displayCount(){
        System.out.println(vehicleCount);
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Toyota", 500000);
        Vehicle v2 = new Vehicle(102, "Honda", 600000);

        v1.display();
        v2.display();

        Vehicle.displayCount();

    }
}
