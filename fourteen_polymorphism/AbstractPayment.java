package fourteen_polymorphism;

import java.util.Random;

public abstract class AbstractPayment implements Payment {

    // string for transaction id
    private String transactionId;

    // abstract method for specific type of payment
    public abstract void processPayment(double amount);

    // generating transaction id
    public String getTransactionId(){
        Random randomID = new Random();
        transactionId = "TX-ID-"+randomID.nextInt((100000000));
        return transactionId;
    }

    // to generate receipt for all payment methods
    @Override
    public void generateReceipt(String transactionId) {
        System.out.println("Receipt Generated For Transaction ID: " +transactionId);
    }

}
