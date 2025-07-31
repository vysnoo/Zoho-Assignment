package day.four.assignment;

public class Bike extends Vehicle{
    protected int cylinders;
    protected int gears;
    protected String coolingType;
    protected String wheelType;
    protected double fuelTankSize;

    Bike(double mileage, double price,int cylinders,int gears,String coolingType,String wheelType,double fuelTankSize) {
        super(mileage, price);
        this.cylinders=cylinders;
        this.gears=gears;
        this.coolingType=coolingType;
        this.wheelType=wheelType;
        this.fuelTankSize=fuelTankSize;
    }
}
