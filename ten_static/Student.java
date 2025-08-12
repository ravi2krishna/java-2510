// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)

package ten_static;

import java.util.Scanner;

public class Student {

    // static variables
    static String instituteName;
    static String courseName;
    static double globalDiscount;

    // init static variables in static blocks
    static {
        instituteName = "Edify";
        courseName = "Java";
        globalDiscount = 0.1;
    }

    // instance variables
    int studentID;
    String studentName;
    int studentAge;
    long studentMobileNumber;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
    int trainerRating;

    String studentDescription;
    double courseFee;
    
    // Scores Array Dynamic
    int [] subjectScores; // will init by student


    // Default Constructor
    public Student(){

    }

    // Constructor to init studentID & studentName 
    // studentAge & studentMobileNumber - Click
    // below is called as Constructor Overloading
    public Student(int studentID, String studentName, long studentMobileNumber, int studentAge, String studentDescription, double courseFee){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
        this.studentDescription = studentDescription;
        this.courseFee = courseFee;
    }

    // display institute info 
    public static void instituteInfo(){
        System.out.println("====== INSTITUTE INFO======");
        System.out.println("Institute Name: "+instituteName);
        System.out.println("Course Name: "+courseName);
        System.out.println("Currently Offer Running Global Discount %: "+(globalDiscount*100));
    }

    // display student info - Hover - non-static or instance
    public void studentInfo() {
        System.out.println("====== STUDENT BASIC INFO======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    // display student info - Click non-static or instance
    public void studentCompleteInfo() {
        System.out.println("====== STUDENT COMPLETE INFO======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Mobile: "+studentMobileNumber);
        System.out.println("Student Age: "+studentAge);
    }

    // calculate course fee
    public void calculateCourseFee() {

        double discount = 0;
        String description = studentDescription;

        if (description.contains("reference")) {
            discount += 5000;
        } 
        if (description.contains("scholarship")) {
            discount += 7000;
        } 
        if (description.contains("promo")) {
            discount += 3000;
        }
        
        // final fee 
        discount += courseFee * globalDiscount;
        double finalFee = courseFee - discount;
        System.out.println("Original Quoted Fees: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Site Wide Discount Applied: "+(courseFee * globalDiscount));
        System.out.println("Final Fee After Discount: "+finalFee);
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

    // calculate Average Score
    public int calculateAverageScore() {
        System.out.println("Enter Number Of Subjects: ");
        int numSubjects = sc.nextInt();
        // dynamic array init
        subjectScores = new int[numSubjects];
        
        int sum = 0;

        // read score one by one
        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter Score For Subject: "+(i+1));
            subjectScores[i] = sc.nextInt();
            sum = sum + subjectScores[i];
        }

        // Average score
        int avgScore = sum / subjectScores.length;

        // For Validating
        System.out.println("Total Score: "+sum);
        System.out.println("Average Score: "+avgScore);

        return avgScore;
        
    }

    // calculating performance credits -> with input
    // score is a parameter i.e used as local
    public int scoreCredits(int avgScore) {
        if (avgScore >=85) {
            return performanceCredits += 5;
        } else if(avgScore >=60) {
            return performanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculating achievement status
    public void achievementStatus() {
        totalCredits = sessionsCredits() + scoreCredits(calculateAverageScore());
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
