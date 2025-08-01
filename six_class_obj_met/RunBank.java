package six_class_obj_met;

public class RunBank {
    public static void main(String[] args) {
        Bank customer1 = new Bank();
        customer1.greetCustomer();
        System.out.println("Balance Of C1: "+customer1.getCurrentBalance());
        customer1.depositAmount(1000);
        System.out.println("Balance Of C1: "+customer1.getCurrentBalance());
        customer1.withdrawAmount(500);
        System.out.println("Balance Of C1: "+customer1.getCurrentBalance());

        Bank customer2 = new Bank(5000);
        customer2.greetCustomer();
        System.out.println("Balance Of C2: "+customer2.getCurrentBalance());
        
        Bank customer3 = new Bank();
        customer3.greetCustomer();
        System.out.println("Balance Of C3: "+customer3.getCurrentBalance());

    }
}
