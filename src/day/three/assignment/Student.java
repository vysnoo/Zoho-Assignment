package day.three.assignment;

public class Student {
    String name;
    int roll_no;
    Student(String name, int roll_no) {
        this.name=name;
        this.roll_no=roll_no;
    }
    public static void main(String[] args) {
        Student obj = new Student("John",2);
        System.out.println(obj.name);
        System.out.println(obj.roll_no);
    }
}
