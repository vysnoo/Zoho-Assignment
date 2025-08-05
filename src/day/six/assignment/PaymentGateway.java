package day.six.assignment;

public class PaymentGateway {
    private String transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    public PaymentGateway(String transactionId, String payerName, String payeeName, double amount, String paymentMethod) {
        this.transactionId = transactionId;
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = "Pending"; // default status
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("❌ Invalid amount");
        }
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void displayTransactionSummary() {
        System.out.println("🧾 Transaction Summary");
        System.out.println("-----------------------");
        System.out.println("Transaction ID   : " + transactionId);
        System.out.println("Payer Name       : " + payerName);
        System.out.println("Payee Name       : " + payeeName);
        System.out.println("Amount           : ₹" + amount);
        System.out.println("Payment Method   : " + paymentMethod);
        System.out.println("Transaction Status: " + transactionStatus);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a payment transaction
        PaymentGateway payment = new PaymentGateway("TXN123456", "Ravi", "Amazon", 1500.0, "UPI");

        // Display initial details
        payment.displayTransactionSummary();

        // Update status and amount securely
        payment.setTransactionStatus("Success");
        payment.setAmount(2000.0); // Secure update

        // Display updated summary
        payment.displayTransactionSummary();
    }
}
