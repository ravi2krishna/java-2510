package fourteen_polymorphism;

import java.util.Scanner;

public class UPIPayment extends AbstractPayment {

    private String upiId;
    private String upiPaymentType;

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI ID: ");
        upiId = sc.next();
        upiId += sc.nextLine(); // buffer
        this.upiId = upiId;
    }

    public String getUpiPaymentType() {
        return upiPaymentType;
    }

    public void setUpiPaymentType(String upiPaymentType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI Type: ");
        upiPaymentType = sc.next();
        upiPaymentType += sc.nextLine(); // buffer
        this.upiPaymentType = upiPaymentType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing via UPI Payment Of "+amount);
    } 

}
