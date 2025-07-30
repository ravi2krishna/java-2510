package six_class_obj_met;

public class RunBank {
    public static void main(String[] args) {
        Bank hdfc = new Bank();
        hdfc.greetCustomer();
        
        hdfc.depositAmount(500);
        System.out.println("Your Current Balance: "+hdfc.getCurrentBalance());

        hdfc.withdrawAmount(200);
        System.out.println("Your Current Balance: "+hdfc.getCurrentBalance());

    }
}
