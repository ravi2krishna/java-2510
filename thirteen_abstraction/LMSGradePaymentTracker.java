// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)
// Inheritance -> Reusability 
// Encapsulation -> Hiding The Data from rest of world
// Abstraction -> Hiding The Implementation

package thirteen_abstraction;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Now implementing Abstraction -> Student
        Personable student = new Student();
        student.setPersonDetails();;
        student.displayPersonDetails();

        ((Payables)student).calculatePayment();
        student.achievementStatus();

        // Now implementing Abstraction -> Trainer
        Personable trainer = new Trainer();
        trainer.setPersonDetails();
        trainer.displayPersonDetails();
        ((Payables)trainer).calculatePayment();

    }
}
