package day.three.assignment;

public class Employee1 {
    String name;
    int yearOfJoin;
    String address;

    Employee1(String name,int yearOfJoin,String address){
        this.name=name;
        this.yearOfJoin=yearOfJoin;
        this.address=address;
    }

    void display(){
        System.out.printf("%-10s %-15s %-10s\n",name,yearOfJoin,address);
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Robert", 1994, "64C- WallsStreat");
        Employee1 e2 = new Employee1("Sam", 2000, "68D- WallsStreat");
        Employee1 e3 = new Employee1("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-15s %-10s\n","Name","Year of Join","Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
