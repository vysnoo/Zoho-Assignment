package day.five.assignment;

public class InPatientRecord extends MedicalRecord{

    int roomNumber;
    int numberOfDaysAdmitted;
    int roomCharges;

    int calculateTotalCharges(){
        return numberOfDaysAdmitted*roomCharges;
    }
    public void inputInPatientDetails() {
        inputRecordDetails(); // Call base class method
        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();
        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();
        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextInt();
        sc.nextLine(); // Consume newline
    }
    void displayRecord(){
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: " + roomCharges);
        System.out.println("Total Charges: " + calculateTotalCharges());
    }

}
