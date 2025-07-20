package day.two.part.two.assignment;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr, len);
    }
    static void print(int[] x, int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9) {
                singleDigitSum += x[i];
            } else if (x[i] >= 10 && x[i] <= 99) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println("Sum of single-digit elements: " + singleDigitSum);
        System.out.println("Sum of double-digit elements: " + doubleDigitSum);
    }
}
