package fifth_control_stmts;

public class Demo {
    public static void main(String[] args) {
        int num = 10;
        // check if the given num is positive 
        if (num>0) {
            System.out.println("The Number is Positive");
        }
        // check if the given num is positive or negative
        if (num>0) {
            System.out.println("The Number is Positive");
        } else {
            System.out.println("The Number is Negative");
        }

        // Vote Eligibility Check -> if else
        int age = 21;
        if (age >=18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        // Vote Eligibility Check -> ternary operator
        // variable = condition ? value_if_true:value_if_false;
        String msg = (age >=18) ? "You can vote":"You cannot vote";
        System.out.println(msg);

        // else if ladder
        int avg_score = 20;
        if (avg_score>=90) {
            System.out.println("A Grade");
        } else if (avg_score>=75) {
            System.out.println("B Grade");
        } else if (avg_score>=60) {
            System.out.println("C Grade");
        } else if (avg_score>=50) {
            System.out.println("D Grade");
        } else if (avg_score>=35) {
            System.out.println("E Grade");
        } else {
            System.out.println("Failed");
        }

        //switch case
        int choice = 8;
        switch (choice) {
            case 1:
                System.out.println("A Selected");
                break;
            case 2:
                System.out.println("B Selected");
                break;
            case 3:
                System.out.println("C Selected");
                break; 
            case 4:
                System.out.println("D Selected");
                break;    
            default:
                System.out.println("Invalid Choice");
                break;
        }

       //switch case - fall through (old way till java 7)
       String category;

       switch (age) {
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
               category = "Toddler";
               break;

           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
               category = "Child";
               break;

           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
           case 18:
           case 19:
               category = "Teenager";
               break;

           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
           case 25:
           case 26:
               category = "Young Adult";
               break;

           default:
               category = "Adult";
               break;
       }

       System.out.println(category);
       
       
       //switch case - using arrow operator (from java 8 supports)
       String category_age = switch (age) {
               case 0, 1, 2, 3, 4 -> "Toddler";
               case 5, 6, 7, 8, 9, 10, 11, 12 -> "Child";
               case 13, 14, 15, 16, 17, 18, 19 -> "Teenager";
               case 20, 21, 22, 23, 24, 25, 26 -> "Young Adult";
               default -> "Adult";
           };
        System.out.println(category_age); 

        // nested condition check 
        // -> check if user can enter a club age is 21 or above
        // should also have a valid ID    
        int age_verify = 11;
        boolean id = true;
        if (age_verify >=21) {
            if (id == true) {
                System.out.println("Can Enter");
            } else {
                System.out.println("Cannot Enter Without ID");
            }
        } else {
            System.out.println("Cannot Enter You are Too Young");
        } 

    }
}
