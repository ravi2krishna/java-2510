package six_class_obj_met;

public class Calculator {

    // Method with no return type and no parameters
    public void greetCalculator() {
        System.out.println("Hello, there i can do calculations");
    }

    // Method with return type and a single parameter
    public String numberType(int num) {
        if (num>0) {
            return "Positive Number";
        } else {
            return "Negative Number";
            // return 10;
        }
    }

    // Method with return type and multiple parameters
    public int addNumbers(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calObj = new Calculator();
        calObj.greetCalculator();
        System.out.println(calObj.numberType(-10));
        System.out.println(calObj.addNumbers(230, 20));
    }
    
}
