package day.seven.assignment;

import java.util.Scanner;

public interface PaymentMethod {
 void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
 Scanner sc = new Scanner(System.in);
@Override
 public void pay(double amount){
 System.out.println("Processing payment.......");
 System.out.println("Enter the last 4 digits of the Credit card");
 String cardNo = sc.nextLine();
 System.out.println("Enter the OTP that sent to your registered mobile number");
 String otp = sc.nextLine();

 if(otp.equals("1234")){
  System.out.println("Authorization successful for Card ending "+ cardNo);
  System.out.println("Credit card payment successful.");
 }else {
  System.out.println("Authorization failed, Payment declined");
 }

 }

}

class DebitCardPayment implements PaymentMethod{

 public void pay(double amount){
  Scanner sc = new Scanner(System.in);
  System.out.println("Processing payment");
  System.out.println("Enter your 4 digit pin");
  String pin = sc.nextLine();

  if(pin.equals("4321")){
   System.out.println("Debit card, Payment successful");
  }else {
   System.out.println("Incorrect pin, Payment Declined");
  }

 }

}

class UPIPayment implements PaymentMethod{
 public void pay(double amount){
  Scanner sc = new Scanner(System.in);
  System.out.println("Payment Processing.......");
  System.out.println("Enter your UPI Id");
  String upi = sc.nextLine();
  System.out.println("Enter your UPI pin");
  String pin = sc.nextLine();

  if(pin.equals("0000")){
   System.out.println("UPI payment successful");
  }else {
   System.out.println("Incorrect UPI, Payment Declined");
  }

 }
}

class MainPayment{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Payment Processing.......");
  System.out.println("Enter the amount you want to pay");

  double amount = 100;

  System.out.println("Select the payment method");
  System.out.println("1. Credit card");
  System.out.println("2. Debit Card");
  System.out.println("3. UPI payment");

  int opt = sc.nextInt();
  PaymentMethod payment = null;
  switch (opt){
   case 1 : payment = new CreditCardPayment();
   break;
   case 2:  payment = new DebitCardPayment();
   break;
   case 3: payment = new UPIPayment();
   break;
   default:
    System.out.println("Invalid choice");
    sc.close();
    return;
  }
  payment.pay(amount);
  sc.close();
 }
}