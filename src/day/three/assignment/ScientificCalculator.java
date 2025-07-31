package day.three.assignment;

public class ScientificCalculator extends AdvancedCalculator{
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double log(double value) {
        if (value <= 0) throw new ArithmeticException("Log input must be positive");
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }

    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();


        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));


        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Modulus: " + calc.modulus(10, 3));
        System.out.println("Square Root: " + calc.squareRoot(16));


        System.out.println("Sin(30): " + calc.sin(30));
        System.out.println("Cos(60): " + calc.cos(60));
        System.out.println("Log(10): " + calc.log(10));
        System.out.println("Exp(2): " + calc.exp(2));
    }
}
