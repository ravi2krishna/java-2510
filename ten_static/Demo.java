package ten_static;

import java.util.Random;

public class Demo {

    // static / non-static
    public int number; // non-static variable
 
    public static String instituteName = "Digital Edify"; // static variable
    
    public static void main(String[] args) {
        // Demo d1 = new Demo();
        // without object using static we can allocate memory block -> method area
        int a = 10;
        int b = 20;
        System.out.println("Sum is: "+(a+b));

        Demo d1 = new Demo();
        d1.number = new Random().nextInt();
        System.out.println("Student 1 ID: "+d1.number);
        System.out.println("Student 1 Institute: "+d1.instituteName);
        System.out.println("Student 1 Institute: "+Demo.instituteName);

        Demo d2 = new Demo();
        d2.number = new Random().nextInt();
        System.out.println("Student 2 ID: "+d2.number);
        System.out.println("Student 2 Institute: "+d2.instituteName);
        System.out.println("Student 2 Institute: "+Demo.instituteName);

        Demo d3 = new Demo();
        d3.number = new Random().nextInt();
        System.out.println("Student 3 ID: "+d3.number);
        System.out.println("Student 3 Institute: "+d3.instituteName);
        System.out.println("Student 3 Institute: "+Demo.instituteName);

        // Demo.num = new Random().nextInt();
        // System.out.println(Demo.num);
        
        // Demo.num = new Random().nextInt();
        // System.out.println(Demo.num);

        // Demo.num = new Random().nextInt();
        // System.out.println(Demo.num);


    }
}
