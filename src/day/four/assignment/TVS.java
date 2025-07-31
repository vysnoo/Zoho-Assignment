package day.four.assignment;

public class TVS extends Bike{
    private String makeType;

    TVS(String makeType,double mileage, double price, int cylinders, int gears, String coolingType, String wheelType, double fuelTankSize) {
        super(mileage, price, cylinders, gears, coolingType, wheelType, fuelTankSize);
        this.makeType=makeType;
    }
    public void display() {
        System.out.println("TVS Bike Details:");
        System.out.println("Make Type: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("------------------------");
    }
}
