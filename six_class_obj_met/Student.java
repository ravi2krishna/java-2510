// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects

package six_class_obj_met;

import java.util.Scanner;

public class Student {
    // instance variables
    int studentID;
    String studentName;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
    int trainerRating;

    // display student info
    public void studentInfo() {
        System.out.println("====== STUDENT INFO======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    // For Taking inputs
    Scanner sc = new Scanner((System.in));

    // calculating attendance credits -> no input
    public int sessionsCredits() {
        System.out.println("Enter Total Sessions Attended: ");
        totalSessionsAttended = sc.nextInt();
        if (totalSessionsAttended>=30) {
            return attendanceCredits += 5;
        } else if (totalSessionsAttended>=20) {
            return attendanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculating performance credits -> with input
    // score is a parameter i.e used as local
    public int scoreCredits(int score) {
        if (score >=85) {
            return performanceCredits += 5;
        } else if(score >=60) {
            return performanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculating achievement status
    public void achievementStatus() {
        totalCredits = sessionsCredits() + scoreCredits(95);
        if (totalCredits>=10) {
            System.out.println("==GOLD==");
        } else if (totalCredits>=8) {
            System.out.println("==SILVER==");
        } else {
            System.out.println("==NEED IMPROVEMENT==");
        }
    }

    // assign trainer rating
    public int trainerRatings() {
        System.out.println("Enter Trainer Rating: (1-5)");
        trainerRating = sc.nextInt();

        if (trainerRating==5) {
            return 5000;
        } else {
            return 0;
        }
    }

}
