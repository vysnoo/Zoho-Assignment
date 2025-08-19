package day.nine.assignment;

// Java checks first the index value - So it doesnt therow the divide by zero exception

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};

        try {
            // risky operation
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient: " + quotient);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid array index!");
            System.out.println("Details: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println("Details: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Some unexpected error occurred!");
            System.out.println("Details: " + e.getMessage());

        } finally {
            System.out.println("Program execution finished (finally block executed).");
        }
    }
}
