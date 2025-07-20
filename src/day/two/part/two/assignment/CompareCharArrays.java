package day.two.part.two.assignment;

public class CompareCharArrays {
    public static void main(String[] args) {
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};

        boolean identical = true;

        if (X.length != Y.length) {
            identical = false;
        } else {
            // Compare elements one by one
            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    identical = false;
                    break;
                }
            }
        }

        if (identical) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }
}
