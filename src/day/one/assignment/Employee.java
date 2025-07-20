package day.one.assignment;

public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary){
    this.empId=empId;
    this.name=name;
    this.department=department;
    this.salary=salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee(1,"Vishnu","CSE",5000000);
        obj.display();
    }
}
