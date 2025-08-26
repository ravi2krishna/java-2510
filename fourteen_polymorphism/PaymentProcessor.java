package fourteen_polymorphism;

// Overloading --> Polymorphism
public class PaymentProcessor {

    // make payment for net banking --> Overloading
    public void makePayment(double amount, String bankName) {
        System.out.println("====== NET BANKING PAYMENT ======");
        NetBanking nb = new NetBanking();
        System.out.println("Amount To Pay: "+amount);
        nb.processPayment(amount);
        nb.generateReceipt(nb.getTransactionId());
    }

    // make payment for credit card --> Overloading
    public void makePayment(double amount, int cardNumber) {
        System.out.println("====== CREDIT CARD PAYMENT ======");
        CreditCardPayment cc = new CreditCardPayment();
        cc.processPayment(amount);
        cc.generateReceipt(cc.getTransactionId());
    }

    // make payment for upi --> Overloading
    public void makePayment(double amount, String upiId, String upiPaymentType) {
        System.out.println("====== UPI PAYMENT ======");
        UPIPayment upi = new UPIPayment();
        upi.processPayment(amount);
        upi.generateReceipt(upi.getTransactionId());
    }

}
