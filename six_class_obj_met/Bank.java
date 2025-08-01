package six_class_obj_met;

public class Bank {

    double currentBalance;

    public Bank(){
        // every bank account you create - minimum 2000 bal is must
        currentBalance = 2000;
    }

    public Bank(double custom_amount_to_open_account){
        // every bank account you create - minimum 2000 bal is must
        currentBalance = custom_amount_to_open_account;
    }


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
