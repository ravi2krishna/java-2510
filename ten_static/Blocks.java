package ten_static;

public class Blocks {

    // non-static data
    int number;

    // static block
    static {
        System.out.println("Static Block Executed");
    }

    // non-static or instance blocks -> initialize non-static variables
    {
        System.out.println("Non-Static Block Executed");
        number = 20;
        System.out.println(number);
    }

    // Constructor Execution

    public static void main(String[] args) {
        Blocks b = new Blocks();
        System.out.println("Main Method Executed");
    }
}
