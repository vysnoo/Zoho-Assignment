package day.seven.assignment;

import javax.xml.namespace.QName;

public class BankMain {
    public static void main(String[] args) {

        Customer c = new Customer("Vishnu",14547);
        Account a = new Account(456845,100000);

        RBI sbi = new SBI(c,a);

        System.out.println("\n--- SBI Account ---");
        sbi.displayCustomerAndAccountDetails();
        System.out.println("Interest in SBI : "+sbi.getInterestRate());
        a.deposit(1000);
        a.withdraw(500,sbi.getWithdrawalLimit());

        Customer c1 = new Customer("Tamil selvi",2564544);
        Account a1 = new Account(245485,45555);

        RBI icici = new ICICI(c1,a1);

        System.out.println("\n--- ICICI Account ---");
        sbi.displayCustomerAndAccountDetails();
        System.out.println("Interest in ICICI : "+icici.getInterestRate());
        a1.deposit(5222);
        a1.withdraw(45,icici.getWithdrawalLimit());

        Customer  c2 = new Customer("Kirubakaran",45654552);
        Account a2= new Account(595298987,56644);
        RBI pnb = new PNB(c2,a2);

        System.out.println("\n--- PNB Account ---");
        pnb.displayCustomerAndAccountDetails();
        System.out.println("Interest in pnb : "+pnb.getInterestRate());
        a2.deposit(562);
        a2.withdraw(564,pnb.getWithdrawalLimit());

    }
}

class Customer{
    private String customerName;
    private int customerId;

    Customer(String customerName,int customerId){
        this.customerName= customerName;
        this.customerId= customerId;
    }

    void displayCustomerDetails(){
        System.out.println("Customer Name : "+ this.customerName);
        System.out.println("Customer ID : "+this.customerId);
    }
}

class Account{
    private int accountNo;
    private double accountBalance;

    Account(int accountNo,double accountBalance){
        this.accountNo=accountNo;
        this.accountBalance=accountBalance;
    }

    void deposit(double amount){
        this.accountBalance+=amount;
        System.out.println("Deposited "+ amount+" | New Balance : "+ this.accountBalance);
    }

    void withdraw(double amount, double withdrawalLimit){
        if(amount>withdrawalLimit){
            System.out.println("Amount exceeds the withdrawal limit");
        }else if(amount<1){
            System.out.println("Invalid withdrawal request");
        }else if(amount>accountBalance){
            System.out.println("Insufficient account balance to process your request");
        }else{
            this.accountBalance-=amount;
            System.out.println("The amount "+amount+"has been withdrawed, The new Balance will be : "+accountBalance);
        }

    }

    void displayAccountDetails(){
        System.out.println("Account Number : "+this.accountNo);
        System.out.println("Account Balance : "+ this.accountBalance);
    }
}

abstract class RBI{
    Customer c;
    Account a;

    protected static final double MIN_INTEREST_RATE= 4;
    protected static final double MIN_WITHDRAWAL_AMOUNT= 50000;
    protected static final double MIN_ACCOUNT_BALANCE=500;

    RBI(Customer c,Account a){
        this.c=c;
        this.a=a;
    }

    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();

    void displayCustomerAndAccountDetails(){
        a.displayAccountDetails();
        c.displayCustomerDetails();
    }
}

class SBI extends RBI{
    SBI(Customer c,Account a){
        super(c,a);
    }

    @Override
    public double getInterestRate(){
        return 4;
    }

    @Override
    public double getWithdrawalLimit(){
        return 40000;
    }

}

class ICICI extends RBI{
    ICICI(Customer c, Account a){
        super(c,a);
    }

    @Override
    public double getInterestRate(){
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit(){
        return 60000;
    }
}

class PNB extends RBI{
    PNB(Customer c, Account a){
        super(c,a);
    }

    @Override
    public double getInterestRate(){
        return 5;
    }

    @Override
    public double getWithdrawalLimit(){
        return 50000;
    }
}

