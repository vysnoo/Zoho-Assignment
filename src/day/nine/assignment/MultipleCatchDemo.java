package day.nine.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept inputs as strings
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            // Convert to integers
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type (mismatch).");

        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e);
        }

        System.out.println("Program finished.");
    }
}
