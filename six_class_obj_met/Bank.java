package six_class_obj_met;

public class Bank {

    double currentBalance = 1000;

    public void greetCustomer(){
        System.out.println("Welcome To Bank");
    }

    public void depositAmount(double amount) {
        currentBalance+= amount; 
        System.out.println("Amount Deposited: "+amount);
    }

    public void withdrawAmount(double amount) {
        currentBalance-= amount;
        System.out.println("Amount Withdrawn: "+amount);
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

}
