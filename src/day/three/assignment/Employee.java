package day.three.assignment;

public class Employee {
    String empName;
    int empId;
    String designation;
    int salary;

    Employee(){
        empName="Not Assigned";
        empId = 0;
        designation = "Unknown";
        salary = 0;
    }

    Employee(String empName, int empId, String designation, int salary) {
        this.empName = empName;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee e){
        this.empName=e.empName;
        this.empId=e.empId;
        this.designation=e.designation;
        this.salary=e.salary;
    }

    void display(){
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(designation);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee emp1= new Employee();
        Employee emp2= new Employee("Vishnu",101,"Software Dev",1000000000);
        Employee emp3 = new Employee(emp2);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
