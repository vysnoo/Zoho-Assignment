package day.nine.assignment;

import java.util.Scanner;

public class ATM_PIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinNo;
        try {
            System.out.println("Enter Your PIN Number");
            pinNo = sc.nextInt();
            if(pinNo<=9999 && pinNo>999){
                System.out.println("Valid Pin Number");
            }else {
                System.out.println("Invalid Pin Number");
            }
        }catch (Exception e){
            System.out.println("Invalid Pin Number");
        }
    }
}
