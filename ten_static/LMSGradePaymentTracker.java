// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)

package ten_static;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Display Institute Details -> calling static method
        Student.instituteInfo();

        Student s1 = new Student(101, "Ravi", 880909099, 20,"i have promo code with me",30000);
        Student s2 = new Student(102, "Krishna", 990909099, 20,"i have reference code with me",30000);

        // student info method - Hover
        s2.studentInfo();

        // student info method - Click
        s2.studentCompleteInfo();

        // Fee Calculation
        s2.calculateCourseFee();

        // Achievement Status
        s2.achievementStatus();

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
