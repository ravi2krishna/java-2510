package fourteen_polymorphism;

import java.util.Scanner;

public class Student extends AbstractPerson implements Personable,Payables {

    // static variables
    // implement encapsulation
    private static String instituteName;
    private static String courseName;
    private static double globalDiscount;

    // init static variables in static blocks
    static {
        instituteName = "Edify";
        courseName = "Java";
        globalDiscount = 0.1;
    }

        // instance variables
    // implement encapsulation
    private int totalSessionsAttended;
    private int attendanceCredits;
    private int performanceCredits;
    private int totalCredits;
    private int trainerRating;
    private double courseFee;
    
    // Scores Array Dynamic
    private int [] subjectScores; // will init by student

    // // Default Constructor
    // public Student(){

    // }

    // // Constructor to init studentID & studentName 
    // // studentAge & studentMobileNumber - Click
    // // below is called as Constructor Overloading
    // // super -> using super we are calling parent class constructor
    // public Student(int studentID, String studentName, int studentAge, long studentMobileNumber, String studentDescription, double courseFee){
    //     super(studentID, studentName, studentAge, studentMobileNumber);
    //     this.studentDescription = studentDescription;
    //     this.courseFee = courseFee;
    // }

    // setters & getters
    public double getCourseFee() {
        return courseFee;
    }

    // let's validate fee - fee should be above 0
    public void setCourseFee(double courseFee) {
        // using condition
        if (courseFee>0) {
            this.courseFee = courseFee;
        } else {
            System.out.println("Fee is invalid");
        }
    }

    // Set Student Details -> as it's a contract
    public void setPersonDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("========= Enter Student Details =========");
        System.out.println("Enter Student ID: ");
        setPersonID(sc.nextInt());

        System.out.println("Enter Student Name: ");
        setPersonName(sc.next());

        System.out.println("Enter Student Age: ");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Student Mobile Number: ");     
        setPersonMobileNumber(sc.nextLong());
        sc.nextLine(); // buffer 

        System.out.println("Enter Description: ");   
        setPersonDescription(sc.nextLine());

        System.out.println("Enter Course Fee: ");
        setCourseFee(sc.nextDouble());

    }

    // Display Student Details -> as it's a contract
    public void displayPersonDetails(){
        System.out.println("======= Student Info =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Mobile: "+getPersonMobileNumber());
        System.out.println("======= Student Info =======");
    }

    // calculate course fee -> as it's a contract (payable)
    public void calculatePayment() {

        double discount = 0;
        String description = getPersonDescription();

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

        // Process The Payment for finalFee
        System.out.println("====== PAYMENT PROCESSING ======");
        System.out.println("Select One Of the Payment Type Below");
        System.out.println("1) Net Banking 2) Credit Card 3) UPI");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        PaymentProcessor pp = new PaymentProcessor();

        if (option == 1) {
            NetBanking nb = new NetBanking();
            nb.setBankName(nb.getBankName());
            System.out.println("Paying FEE: "+finalFee);
            pp.makePayment(finalFee, nb.getBankName());

        } else if (option == 2) {
            CreditCardPayment cc = new CreditCardPayment();
            cc.setCardNumber(cc.getCardNumber());
            System.out.println("Paying FEE: "+finalFee);    
            pp.makePayment(finalFee, cc.getCardNumber());
        } else if (option == 3) {
            UPIPayment upi = new UPIPayment();
            upi.setUpiId(upi.getUpiId());
            upi.setUpiPaymentType(upi.getUpiPaymentType());
            System.out.println("Paying FEE: "+finalFee);    
            pp.makePayment(finalFee, upi.getUpiId(), upi.getUpiPaymentType());
        } else {
            System.out.println("Select Only 1) Net Banking 2) Credit Card 3) UPI");
        }

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

    // calculating achievement status -> as it's a contract
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
