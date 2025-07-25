package fifth_control_stmts;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        
        // loops are for repeated actions
        System.out.println("Hi");

        // Say Hi 10 Times - without loops - manual 
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // Say Hi 10 Times - with loops - automated
        
        //  for syntax 
        // for (int i = 1; i<=10; i++) {

        // }
        
        for (int i = 1; i<=10; i++) {
            System.out.println("Hi");
        }

        // forward direction
        for (int i = 1; i<=5; i++) {
            System.out.println(i);
        }

        // reverse direction
        for (int i = 5; i>=1; i--) {
            System.out.println(i);
        }

        // break scenario -> exit the loop
        for (int i = 1; i<=5; i++) {
            // stop when i is 3
            if (i == 3) {
                break; 
            }
            System.out.println(i);
        }

        // continue scenario -> skip the current iteration
        for (int i = 1; i<=5; i++) {
            // skip when i is 3
            if (i == 3) {
                continue; 
            }
            System.out.println(i);
        }

        // while --> runs block of code, as long as the condition is true
        // while syntax
        // while (condition) {
            
        // }
        // infinite loop
        // while(true) {
        //     System.out.println("Hi");
        // }
        
        // Using Scanner Class we read number called age
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You can Vote");
        } else {
            System.out.println("You cannot Vote");
        }

        // read text
        System.out.println("What is you name ?");
        String name = sc.next();
        System.out.println("Welcome: "+name);


        // simulate while loop
        // System.out.println("Welcome, Do you want to continue: (yes/no)");
        // String user_choice = sc.next();
        // while (user_choice.equals("yes")) {
        //     System.out.println("Do this work");
        // }

        // while 
        int count = 5;
        while (count<=4) {
            System.out.println("Hi: "+count);
            count++;
        }

        // do-while 
        do {
            System.out.println("Hi: "+count);
            count++;
        } while (count<=4);


    }
}
