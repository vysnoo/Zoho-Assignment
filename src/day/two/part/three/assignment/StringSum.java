package day.two.part.three.assignment;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        System.out.println(Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2)));
    }
}
