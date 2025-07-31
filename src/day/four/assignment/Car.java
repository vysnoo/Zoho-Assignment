package day.four.assignment;

public class Car extends Vehicle{

    protected double ownershipCost;
    protected int warranty; // in years
    protected int seatingCapacity;
    protected String fuelType;


    Car(double mileage, double price,double ownershipCost,int warranty,int seatingCapacity,String fuelType) {
        super(mileage, price);
        this.ownershipCost=ownershipCost;
        this.warranty=warranty;
        this.seatingCapacity=seatingCapacity;
        this.fuelType=fuelType;
    }
}
