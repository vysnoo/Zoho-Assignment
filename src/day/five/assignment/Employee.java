package day.five.assignment;

public class Employee {

    protected String name;
    protected int id;

    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    public double calculateSalary(){
        return 0;
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name, int id,double monthlySalary){
        super(name, id);
        this.monthlySalary=monthlySalary;

    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double monthlySalary;
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int id,int hoursWorked,double hourlyRate){
        super(name, id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }

}

class Main{
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Vishnu",101,500000);
        PartTimeEmployee pt = new PartTimeEmployee("Harish",102,5,200);

        ft.displayDetails();
        pt.displayDetails();
    }
}
