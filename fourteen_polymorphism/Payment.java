package fourteen_polymorphism;

// Interface for Payments
public interface Payment {

    // to process payment --> amount
    public void processPayment(double amount);

    // to generate receipt
    public void generateReceipt(String transactionId);

}
