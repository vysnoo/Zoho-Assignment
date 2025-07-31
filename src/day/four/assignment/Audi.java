package day.four.assignment;

public class Audi extends Car{
    private String modelType;

    Audi(String modelType,double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType=modelType;
    }

    public void display() {
        System.out.println("Audi Car Details:");
        System.out.println("Model Type: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("------------------------");
    }
}
