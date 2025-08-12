package day.seven.assignment;

public interface EmpInterface {
    double calculateSal();
    void displayDetails();
}

class FullTimeEmployees implements EmpInterface{
    String name;
    int id;
    double monthlySal;

    FullTimeEmployees(String name,int id,double monthlySal){
        this.name=name;
        this.id=id;
        this.monthlySal=monthlySal;
    }

    public void displayDetails(){
        System.out.println("Name : "+this.name+"\nID : "+ this.id);
    }

    public double calculateSal(){
        return monthlySal;
    }
}

class PartTimeEmployees implements EmpInterface{
    String name;
    int id;
    double hourlySal;
    int hoursWorked;

    PartTimeEmployees(String name,int id,double hourlySal,int hoursWorked){
        this.name=name;
        this.id=id;
        this.hourlySal=hourlySal;
        this.hoursWorked=hoursWorked;
    }

    public double calculateSal(){
        return hoursWorked*hourlySal;
    }

    public void displayDetails(){
        System.out.println("Name : "+this.name+"\nID : "+ this.id);
    }
}

class EmpInterMain{
    public static void main(String[] args) {
        EmpInterface emp1= new FullTimeEmployees("Vishnu",123,400000);
        EmpInterface emp2 = new PartTimeEmployees("Harish",256,500,3);

        emp1.displayDetails();
        System.out.println("Salary : "+emp1.calculateSal());
        emp2.displayDetails();
        System.out.println("Salary : "+emp2.calculateSal());

    }
}