package fourteen_polymorphism;

public class Calculations {

        // without methods overloading 
        // public void add() {
        //     System.out.println("Use case is add two numbers");
        // }        

        // public void add() {
        //     System.out.println("Use case is add two numbers");
        // }
        
        // with methods overloading 
        public void add(int a, int b) {
            System.out.println("Use case is add two numbers");
            System.out.println(a+b);
        }        

        public void add(int a, int b, int c) {
            System.out.println("Use case is add three numbers");
            System.out.println(a+b+c);
        }

        public void add(int a, double b) {
            System.out.println("Use case is add two numbers");
            System.out.println(a+b);
        }
        
        public void add(double a, int b, double c) {
            System.out.println("Use case is add three numbers");
            System.out.println(a+b+c);
        }

        public static void main(String[] args) {
            Calculations obj = new Calculations();
            obj.add(3, 5);
            obj.add(1.5, 5, 3.5);
        }

}
