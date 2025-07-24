package day.three.assignment;

public class Student1 {
    String name;
    int roll_no;
    int phone;
    String address;
    Student1(String name,int roll_no,int phone,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.phone=phone;
        this.address=address;
    }

    void display(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(phone);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1("Sam",1,1234567890,"London");
        Student1 student2 = new Student1("John",2,987654321,"Orlando");
        student1.display();
        student2.display();

    }
}
