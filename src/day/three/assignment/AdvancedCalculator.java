package day.three.assignment;

public  class AdvancedCalculator extends BasicCalculator{

    public double power(int base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int modulus(int a, int b){
        return a%b;
    }

    public double squareRoot(double number) {
        if (number < 0) throw new ArithmeticException("Negative input for square root");
        return Math.sqrt(number);  
    }
}
