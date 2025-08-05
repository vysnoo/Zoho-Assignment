package day.six.assignment;

public class Employee {
    private int empId;
    private String name;
    private String designation;
    private String dep;
    private double monthlySal;

    Employee(int empId,String name,String designation,String dep,double monthlySal){
        this.empId=empId;
        this.name=name;
        this.designation=designation;
        this.dep= dep;
        this.monthlySal=monthlySal;
    }

    public int getEmpId(){
        return this.empId;
    }
    public String getName(){
        return this.name;
    }
    public String getDesignation(){
        return this.designation;
    }
    public String getDep(){
        return this.dep;
    }
    public double getMonthlySal(){
        return this.monthlySal;
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setDep(String dep){
        this.dep=dep;
    }
    public void setMonthlySal(double monthlySal){
        this.monthlySal=monthlySal;
    }

    public double annualSalary(){
        return monthlySal*12;
    }
    public void displayEmployee() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + dep);
        System.out.println("Monthly Salary: ₹" + monthlySal);
        System.out.println("Annual Salary: ₹" + annualSalary());
    }
}

class MainEmp{
    public static void main(String[] args) {
        Employee e = new Employee(101, "Vishnu", "Developer", "IT", 45000.0);
        e.displayEmployee();
    }
}
