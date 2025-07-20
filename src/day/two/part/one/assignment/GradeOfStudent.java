package day.two.part.one.assignment;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage");
        int percent = sc.nextInt();

        if (percent < 0 || percent > 100) {
            System.out.println("Invalid percentage");
            return;
        }

        if(percent>=85 && percent<=100){
            System.out.println("Grade-A");
        }else if(percent>=70){
            System.out.println("Grade-B");
        } else if (percent>=70) {
            System.out.println("Grade-C");
        } else {
            System.out.println("Fail");
        }

        int grade = percent/10;

        switch (grade){
            case 0:
                System.out.println("Fail");
            case 1 :
                System.out.println("Fail");
                break;
            case 2:
                System.out.println("Fail");
                break;
            case 3:
                System.out.println("Fail");
                break;
            case 4:
                System.out.println("Fail");
                break;
            case 5:
                System.out.println("Grade-C");
                break;
            case 6:
                System.out.println("Grade-C");
                break;
            case 7:
                System.out.println("Grade-B");
                break;
            case 8:
                if(percent<85){
                    System.out.println("Grade-B");
                }else {
                    System.out.println("Grade-A");
                }
                break;
            case 9:
                System.out.println("Grade-A");
                break;
            case 10:
                if(percent<=100){
                    System.out.println("Grade-A");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
