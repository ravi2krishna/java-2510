package nine_strings;

import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // length() - Gmail minimum characters for username
        System.out.println("Enter Your Username: ");
        String userName = sc.next();

        if (userName.length() >=6 ) {
            System.out.println("Continue With Password");
        } else {
           System.out.println("Username Should Have Minimum 6 Characters "); 
        }

        // chartAt() - Gender Check M/F 
        System.out.println("Enter Your Gender: ");
        String gender = sc.next();

        if (gender.charAt(0) == 'M' || gender.charAt(0) == 'm' ) {
            System.out.println("Male");
        } else if (gender.charAt(0) == 'F' || gender.charAt(0) == 'f' ) {
           System.out.println("Female"); 
        } else {
            System.out.println("Invalid Input"); 
        }

        // toLowerCase -> convert to lowercase
        String formattedUserName = userName.toLowerCase();
        System.out.println("Given Username: "+userName);
        System.out.println("Formatted Username: "+formattedUserName);
        
        //equals() -> Reset Password Functionality, where both passwords should match
        System.out.println("Enter Your New Password: ");
        String password = sc.next();
        System.out.println("ReEnter Same Password Again: ");
        String newPassword = sc.next();
        if (password.equals(newPassword)) {
            System.out.println("Password Changed Success");
        } else {
            System.out.println("Try Again, Both Password Should Match");
        }

        // toUpperCase() -> PAN functionality
        System.out.println("Enter Your PAN Num To Update: ");
        String pan = sc.next();
        System.out.println("PAN Updated: "+pan.toUpperCase());

        // contains() -> Validate proper email format - @ should be present
        System.out.println("Enter Your Email Address: ");
        String email = sc.next();
        if (email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("InValid Email");
        }

        // startsWith() -> Validate phone number and redirect to appropriate country
        System.out.println("Enter Your Mobile Number: ");
        String mobileNumber = sc.next();

        if (mobileNumber.startsWith("+1")) {
            System.out.println("Calling USA Number");
        } else if (mobileNumber.startsWith("+86")) {
            System.out.println("Calling China Number");
        } else if (mobileNumber.startsWith("+33")) {
            System.out.println("Calling France Number");
        } else if (mobileNumber.startsWith("+91")) {
            System.out.println("Calling India Number");
        } else {
            System.out.println("ISD is only for Limited Countries");
        }

        // endsWith() -> Validate if email sync is possible or not
        // gmail -> gmail -> Okay
        // gmail -> yahoo -> Not Okay
        if (email.endsWith("@gmail.com")) {
            System.out.println("Gmail Sync Is Completed");
        } else {
            System.out.println("Only Gmail Sync Is possible");
        }

        // trim() -> gmail remove unnecessary spaces at the beginning and end
        System.out.println("Original Email: "+email);
        System.out.println("Formatted Email: "+email.trim());

        // "SHIRT-ABBA-XL"; // SHIRT-STYLE-SIZE
        // indexOf() & substring()
        System.out.println("Enter Your Product ID To Extract Info");
        String shirtInfo = sc.next();
        if (shirtInfo.indexOf("-") == -1) {
            System.out.println("Invalid Product ID");
        } else {
            System.out.println("Dress Type: "+shirtInfo.substring(0, 5));
            System.out.println("Model Type: "+shirtInfo.substring(6, 10));
            System.out.println("Size Type: "+shirtInfo.substring(11));
        }

    }
}
