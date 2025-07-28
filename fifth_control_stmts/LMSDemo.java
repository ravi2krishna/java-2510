package fifth_control_stmts;

// Variables - Data Types - Operators - Type Casting - Conditionals - Loops

import java.util.Scanner;

public class LMSDemo {
    public static void main(String[] args) {
        
        // Collect Student ID & Name
        Scanner sc = new Scanner(System.in);

        // Prompt Student for ID & Name
        System.out.println("Enter ID: ");
        int studentID = sc.nextInt();

        System.out.println("Enter Name: ");
        String studentName = sc.next();

        // Update attendance & scores
        System.out.println("Enter Attendance: ");
        double attendance = sc.nextDouble();
        int totalScore = 0;
        int numberOfSubjects = 0;

        // using while - repeatedly ask the user to enter scores 
        char continueInput = 'y';
        while (continueInput == 'y' || continueInput == 'Y') {
            System.out.println("Enter Score For Subject: "+(numberOfSubjects+1));
            int currentScore = sc.nextInt();
            totalScore+=currentScore;
            numberOfSubjects++;
            System.out.println("Do you want to add another score (y/n): ");
            continueInput = sc.next().charAt(0);
        }

        // Calculate Average Score:
        // Type Casting Needed -> 
        double avgScore = (double) totalScore/numberOfSubjects;
        System.out.println("Average Score: "+avgScore);

        // Determine Performance Level
        String performance;
        if (avgScore >=85) {
            performance = "Excellent";
        } else if (avgScore >=70) {
            performance = "Good";
        } else if (avgScore >=50){
           performance = "Average";
        } else {
            performance = "Needs Improvement";
        }

        // Check Attendance Status -> less than 75% : WARNING - LOW ATTENDANCE 
        // if 75 or above : OK - ATTENDANCE SATISFIED
        // try with ternary operator
        // syntax - var = condition ? "value_if_true" : "value_if_false"
        String attendanceStatus = attendance >= 75 ? "OK - ATTENDANCE SATISFIED" : "WARNING - LOW ATTENDANCE ";
        
        // Display Final Results
        System.out.println("Name: "+studentName);
        System.out.println("Student Attendance: "+attendance);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);

        System.out.println(studentName+" Performance: "+performance);
        System.out.println(studentName+"Attendance Performance: "+attendanceStatus);

    }
}
