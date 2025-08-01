package seven_constructors;

public class ConstructorDemo {
    // methods
    public void doSomething(){
        System.out.println("Doing Some Task");
    }

    // instance vars
    int x;
    int y;

    int a;
    int b;

    // explicit constructor -> Default Constructor
    public ConstructorDemo(){
        System.out.println("Explicit constructor - set custom default values");
        x = 100;
        y = 200;
    }

    // Parameterized constructor
    public ConstructorDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    

    public int addNumbers() {
        return x + y;
    }

    public int addNums() {
        return a + b;
    }


    public static void main(String[] args) {
        // create constructor -> implicit constructor will be create
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj_new = new ConstructorDemo(400, 500);

        System.out.println("Sum Of Values: "+obj.addNumbers());
        System.out.println("Sum Of Values: "+obj.addNums());

        System.out.println("Sum Of Values: "+obj_new.addNumbers());
    }

}
