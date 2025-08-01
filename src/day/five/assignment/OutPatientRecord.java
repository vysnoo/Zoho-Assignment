package day.five.assignment;

public class OutPatientRecord extends MedicalRecord {
    String docName;
    int consulFee;

     void inputOutPatientDetails() {
        inputRecordDetails(); // Call base class method
        System.out.print("Enter Doctor Name: ");
        docName = sc.nextLine();
        System.out.print("Enter Consultation Fee: ");
        consulFee = sc.nextInt();
        sc.nextLine(); // Consume newline
    }


    void displayRecord(){
        super.displayRecord();
        System.out.println("Doctor Name: " + docName);
        System.out.println("Consultation Fee: " + consulFee);
    }


}
