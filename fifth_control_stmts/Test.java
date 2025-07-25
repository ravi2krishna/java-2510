package fifth_control_stmts;

public class Test {
    public static void main(String[] args) {
        // 0 to 4 -> Toddler
        // 5 to 12 -> Child
        // 13 to 19 -> Teenager
        // 20 to 26 -> Young Adult
        // 27 Above -> Adult

        // using else if ladder
        int age = 10;
        if (age<=4) {
            System.out.println("Toddler");
        }
        else if (age>=5 && age<=12) {
            System.out.println("Child");
        } else if (age>=13 && age<=19) {
            System.out.println("Teenager");
        } else if (age>=20 && age<=26) {
            System.out.println("Young Adult");
        } else {
            System.out.println("Adult");
        }

        // using switch case
        String category;
        switch (age) {
            case 0:
            case 2:
            case 3:
                System.out.println("Toddler");    
                break;
            case 15:
                System.out.println("Teenager");    
                break; 
            case 22:
                System.out.println("Young Adult");    
                break;       
        
            default:
                System.out.println("Adult");    
                break; 
        }

    }
}
