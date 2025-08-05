package day.six.assignment;
import day.six.assignment.arithmetic.Arithmetic;
import day.six.assignment.stringutils.stringutils;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int a=10;
        int b=2;
        System.out.println(arithmetic.add(a,b));
        System.out.println(arithmetic.subtract(a,b));
        System.out.println(arithmetic.multiply(a,b));
        System.out.println(arithmetic.divide(a,b));
        System.out.println( arithmetic.modulo(a,b));


        stringutils str = new stringutils();
        String str1="Hello";
        String str2="Vishnu";
        System.out.println(str.Concat(str1,str2));
        System.out.println(str.reverse(str1));
        System.out.println(str.length(str1));
    }
}
