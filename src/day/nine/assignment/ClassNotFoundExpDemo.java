package day.nine.assignment;

public class ClassNotFoundExpDemo {
        public static void main(String[] args) {
            try {
                Class.forName("com.example.MyClass"); // Looking for this class
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
