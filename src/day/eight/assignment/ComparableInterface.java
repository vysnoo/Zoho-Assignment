package day.eight.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23,"Vishnu"));
        studs.add(new Student(23,"Swetha"));
        studs.add(new Student(30,"Matt Murdock"));
        studs.add(new Student(35,"Dexter Morgan"));
        studs.add(new Student(26,"Peter Parker"));
        studs.add(new Student(5,"Little Baby"));

        Collections.sort(studs);
        for(Student s : studs){
            System.out.println("Age : "+s.age+" Name : "+s.name);
        }
    }
}

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        }else{
            return -1;
        }
    }
}