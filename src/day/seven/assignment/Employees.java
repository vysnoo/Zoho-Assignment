package day.seven.assignment;

public abstract class Employees {
    String name;
    int EmpId;

    public Employees(String name,int EmpId){
        this.name= name;
        this.EmpId=EmpId;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Name : "+name+"\nEmployee ID : "+EmpId);
    }
}

class FullTimeEmployee extends Employees{

    double monthlySal;
    FullTimeEmployee(String name,int EmpId,double monthlySal){
        super(name,EmpId);
        this.monthlySal=monthlySal;
    }

    public double calculateSalary(){
        return monthlySal;
    }
}

class PartTimeEmployee extends Employees{

    double hourlySal;
    int hoursWorked;

    PartTimeEmployee(String name,int empId,double hourlySal,int hoursWorked){
        super(name,empId);
        this.hourlySal=hourlySal;
        this.hoursWorked=hoursWorked;
    }

    public double calculateSalary(){
        return hoursWorked*hourlySal;
    }
}

class EmpMain{
    public static void main(String[] args) {
        Employees emp1 = new FullTimeEmployee("Vishnu",123,200000);
        Employees emp2 = new PartTimeEmployee("Harish",524,200,6);

        emp1.displayDetails();
        System.out.println("Salary : "+emp1.calculateSalary());

        emp2.displayDetails();
        System.out.println("Salary : "+emp2.calculateSalary());

    }
}