package day.eight.assignment;

class Stu_Dent implements Cloneable{
    int rollNo;
    String name;
    String dep;

    Stu_Dent(int rollNo,String name,String dep){
        this.rollNo=rollNo;
        this.name=name;
        this.dep=dep;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "\nRoll No - "+this.rollNo+"\nName - "+this.name+"\nDepartment - "+this.dep;
    }

}
public class CloneStudentDemo {

    public static void main(String[] args) {
        try {
            // If Student does NOT implement Cloneable → exception
            Stu_Dent s1 = new Stu_Dent(101,"Vishnu", "CSE");
            Stu_Dent s2 = (Stu_Dent) s1.clone(); // attempt to clone

            System.out.println("Original: " + s1);
            System.out.println("Cloned:   " + s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException occurred: Class does not implement Cloneable");
        }

        // Case B: With Cloneable (already implemented above)
        try {
            Stu_Dent s1 = new Stu_Dent(102,"Kumar", "ECE");
            Stu_Dent s2 = (Stu_Dent) s1.clone(); // now works fine

            System.out.println("\nOriginal: " + s1);
            System.out.println("Cloned:   " + s2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
