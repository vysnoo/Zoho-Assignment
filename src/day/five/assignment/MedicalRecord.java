package day.five.assignment;

import java.util.Scanner;

public class MedicalRecord {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    Scanner sc = new Scanner(System.in);

    void inputRecordDetails(){
        System.out.println("Enter the recordId");
        recordId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter patient name");
        patientName=sc.nextLine();
        System.out.println("Enter the date of visit");
        dateOfVisit=sc.nextLine();
        System.out.println("Enter the diagnosis");
        diagnosis=sc.nextLine();
    }

    void displayRecord(){
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}
