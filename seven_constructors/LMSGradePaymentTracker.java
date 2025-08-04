// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors

package seven_constructors;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        
        // Set Student Identity
        // Student s1 = new Student(); -> previously

        // set Student Identity using Constructor
        Student s1 = new Student(101, "Ravi");
        // s1.studentID
        // s1.studentName

        Student s2 = new Student(102, "Krishna", 990909099, 20);
        // s2.studentID
        // s2.studentName
        // s2.studentMobileNumber
        // s2.studentAge

        // student info method - Hover
        s1.studentInfo();

        // student info method - Click
        s2.studentCompleteInfo();

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
