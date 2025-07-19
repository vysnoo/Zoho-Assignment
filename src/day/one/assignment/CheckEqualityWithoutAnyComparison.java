package day.one.assignment;

public class CheckEqualityWithoutAnyComparison {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 50;

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        if (str1.equals(str2)) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }
    }
}
