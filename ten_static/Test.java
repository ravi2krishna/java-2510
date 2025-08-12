package ten_static;

public class Test {

    // instance variables
    public int num = 10;

    // static variable 
    public static int instituteID = 1019101;

    // instance / non-static methods -> work on instance variables
    public void printNum() {
        num+=5;
        System.out.println(num);
    }

    // static method -> work on static variables
    public static void changeInstituteID(int new_id){
        instituteID = new_id;
        System.out.println("Institute ID: "+instituteID);
    }


    public static void main(String[] args) {
        
        Test t = new Test();
        t.printNum();
        Test.changeInstituteID(909090);
    }
}
