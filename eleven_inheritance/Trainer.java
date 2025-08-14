package eleven_inheritance;

import java.util.Scanner;

public class Trainer extends Person {
    // instance variables
    int totalSessionsTaken;
    int paymentForSessions;
    int totalPayment;

    // super -> using super we are calling parent class constructor 
    public Trainer(int trainerID, String trainerName, int trainerAge, long trainerMobileNumber){
        super(trainerID, trainerName, trainerAge, trainerMobileNumber);
    }

    // calculates the trainer’s payment
    public void sessionsPayments() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Sessions Taken: ");
        totalSessionsTaken = sc.nextInt();
        paymentForSessions = 1500 * totalSessionsTaken;

        // Access student object to inject rating
        Student studentObj = new Student();
        System.out.println("==== Student Rating====");
        int trainingBouns = studentObj.trainerRatings();
        int totalPayment = paymentForSessions + trainingBouns;
        System.out.println("==== Trainer Payment====");
        System.out.println("Total Payment To Be Made: "+totalPayment);

    }

}
