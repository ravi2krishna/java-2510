package fourteen_polymorphism;

import java.util.Scanner;

public class NetBanking extends AbstractPayment {

    private String bankName;

    public String getBankName() {
        return bankName;
    }
    
    public void setBankName(String bankName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        bankName = sc.next();
        bankName += sc.nextLine(); // buffer
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing via NetBanking Payment Of "+amount);
    }
 
}
