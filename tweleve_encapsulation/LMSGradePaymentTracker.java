// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)
// Inheritance -> Reusability 
// Encapsulation -> Hiding The Data from rest of world

package tweleve_encapsulation;

import java.util.Scanner;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Display Institute Details -> calling static method
        Student.instituteInfo();

        // Student s1 = new Student(101, "Ravi", 880909099, 20,"i have promo code with me",30000);
        // Student s2 = new Student(102, "Krishna", 990909099, 20,"i have reference code with me",30000);

        // student info method - Click
        // with inheritance we are reusing parent class displayInfo()

        Student s2 = new Student();
        Scanner sc = new Scanner(System.in);

        // like a web app scenario
        System.out.println("Enter Student ID: ");
        s2.setPersonID(sc.nextInt());

        System.out.println("Enter Student Name: ");
        s2.setPersonName(sc.next());

        System.out.println("Enter Student Age: ");
        s2.setPersonAge(sc.nextInt());

        System.out.println("Enter Student Mobile Number: ");     
        s2.setPersonMobileNumber(sc.nextLong());

        System.out.println("Enter Description: "); 
        sc.nextLine(); // buffer    
        s2.setStudentDescription(sc.nextLine());

        System.out.println("Enter Course Fee: ");
        s2.setCourseFee(sc.nextDouble());

        s2.displayInfo();

        // Fee Calculation
        s2.calculateCourseFee();

        // Achievement Status
        s2.achievementStatus();

        // Set Trainer Identity
        Trainer t1 = new Trainer();
        System.out.println("Enter Trainer ID: ");
        t1.setPersonID(sc.nextInt());

        System.out.println("Enter Trainer Name: ");
        t1.setPersonName(sc.next());

        System.out.println("Enter Trainer Age: ");
        t1.setPersonAge(sc.nextInt());

        System.out.println("Enter Trainer Mobile Number: ");     
        t1.setPersonMobileNumber(sc.nextLong());


        // Trainer info method
        // with inheritance we are reusing parent class displayInfo()
        t1.displayInfo();

        // Calculate Trainer payment
        t1.sessionsPayments();


    }
}
