package fourth_operators;

public class LMSOperators {
    public static void main(String[] args) {
        
        // Variables 
        int studentID = 101;
        String studentName = "Ravi"; 
        byte age = 20; 
        byte quizScore = 70;  
        byte assignmentScore = 80;
        byte examScore = 90;
        double attendance = 80;

        // Calculation --> Arithmetic Operators
        double totalScore = quizScore + assignmentScore + examScore;
        double averageScore = totalScore/3;

        // Determine Student Passed --> Relational Operator (75 or above)
        boolean isStudentPassed = averageScore >= 75;

        // Update Attendance --> Increment Operator
        attendance++; 

        // Evaluate student qualified --> Logical Operator
        // requires high attendance(80 and above) and a passing grade
        boolean studentQualifiedAward = attendance>=80 && isStudentPassed;

        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageScore);
        System.out.println("Updated Attendance: "+attendance);

        System.out.println("Student Passed: "+isStudentPassed);
        System.out.println("Student Awarded: "+studentQualifiedAward);


    }
}
