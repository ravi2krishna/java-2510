package six_class_obj_met;

import java.util.Scanner;

public class Trainer {
    // instance variables
    int trainerID;
    String trainerName;
    int totalSessionsTaken;
    int paymentForSessions;
    int totalPayment;

    // display Trainer info
    public void trainerInfo() {
        System.out.println("====== TRAINER INFO======");
        System.out.println("Trainer ID: "+trainerID);
        System.out.println("Trainer Name: "+trainerName);
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
