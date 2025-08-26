package fourteen_polymorphism;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable,Payables {

    // instance variables
    // implement encapsulation

    // private int totalSessionsTaken;
    // private int paymentForSessions;
    // private int totalPayment;

        private int basePayPerSession;
        private int totalSessionsTaken;
        private int paymentForSessions;
        private int trainingBonus;
        private int totalPayment;

        public int getBasePayPerSession() {
            return basePayPerSession;
        }

        public void setBasePayPerSession(int basePayPerSession) {
            this.basePayPerSession = basePayPerSession;
        }

        public int getTotalSessionsTaken() {
            return totalSessionsTaken;
        }

        public void setTotalSessionsTaken(int totalSessionsTaken) {
            this.totalSessionsTaken = totalSessionsTaken;
        }

        public int getPaymentForSessions() {
            return paymentForSessions;
        }

        public void setPaymentForSessions(int paymentForSessions) {
            this.paymentForSessions = paymentForSessions;
        }

    // Set Trainer Details -> as it's a contract
    public void setPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= Enter Trainer Details =========");
        System.out.println("Enter Trainer ID: ");
        setPersonID(sc.nextInt());

        System.out.println("Enter Trainer Name: ");
        setPersonName(sc.next());

        System.out.println("Enter Trainer Age: ");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Trainer Mobile Number: ");     
        setPersonMobileNumber(sc.nextLong());

        System.out.println("Enter Your Base Pay: ");     
        basePayPerSession = sc.nextInt();

    }

    // calculate course fee -> as it's a contract (payable)
    public void calculatePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Sessions Taken: ");
        totalSessionsTaken = sc.nextInt();
        paymentForSessions = getBasePayPerSession() * getTotalSessionsTaken();
        // Access student object to inject rating
        Student studentObj = new Student();
        System.out.println("==== Student Rating====");
        int trainingBouns = studentObj.trainerRatings();
        int totalPayment = paymentForSessions + trainingBouns;
        System.out.println("==== Trainer Payment====");
        System.out.println("Total Payment To Be Made: "+totalPayment);
    }

}
