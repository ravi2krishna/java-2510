package six_class_obj_met;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        
        // Set Student Identity
        Student s1 = new Student();
        s1.studentID = 101;
        s1.studentName = "Ravi";

        // student info method
        s1.studentInfo();

        // Session Credits
        // System.out.println("Session Credits: "+s1.sessionsCredits());

        // Performance/Score Credits
        // System.out.println("Score Credits: "+s1.scoreCredits(75));

        // Achievement Status
        s1.achievementStatus();

        // Set Trainer Identity
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "Ravi";

        // Trainer info method
        t1.trainerInfo();

        // Calculate Trainer payment
        t1.sessionsPayments();

    }
}
