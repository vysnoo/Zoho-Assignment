package day.five.assignment;

import java.util.Scanner;

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. InPatient Record");
        System.out.println("2. OutPatient Record");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            InPatientRecord inPatient = new InPatientRecord();
            inPatient.inputInPatientDetails();
            System.out.println("\n--- InPatient Record ---");
            inPatient.displayRecord();
        } else if (choice == 2) {
            OutPatientRecord outPatient = new OutPatientRecord();
            outPatient.inputOutPatientDetails();
            System.out.println("\n--- OutPatient Record ---");
            outPatient.displayRecord();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

}
