// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)
// Inheritance -> Reusability 

package eleven_inheritance;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Display Institute Details -> calling static method
        Student.instituteInfo();

        Student s1 = new Student(101, "Ravi", 880909099, 20,"i have promo code with me",30000);
        Student s2 = new Student(102, "Krishna", 990909099, 20,"i have reference code with me",30000);

        // student info method - Click
        // with inheritance we are reusing parent class displayInfo()
        s2.displayInfo();

        // Fee Calculation
        s2.calculateCourseFee();

        // Achievement Status
        s2.achievementStatus();

        // Set Trainer Identity
        Trainer t1 = new Trainer(101, "Ravi", 30, 880909099);

        // Trainer info method
        // with inheritance we are reusing parent class displayInfo()
        t1.displayInfo();

        // Calculate Trainer payment
        t1.sessionsPayments();

    }
}
