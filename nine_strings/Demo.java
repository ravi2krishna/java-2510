package nine_strings;

public class Demo {
    public static void main(String[] args) {
        int i = 10;
        String s = "Hello";

        // Demo d1 = "Java"; # Other classes Error, only 
        // for strings it is supported

        Demo d1 = new Demo();
        System.out.println(d1); // Object Address

        String s1 = new String();
        System.out.println(s1); // empty string

        String ss1 ="hello";
        String ss2 ="hello";

        // == earlier with operators, compare values
        // == now with strings, compare memory address

        System.out.println(ss1 == ss2);

        System.out.println(System.identityHashCode(ss1));
        System.out.println(System.identityHashCode(ss2));

        // new keyword -> every time new object is created
        String ss3 = new String("hello");
        String ss4 = new String("hello");

        System.out.println(System.identityHashCode(ss3));
        System.out.println(System.identityHashCode(ss4));

        // to compare the content / values
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1.equals(ss3));

        // Note 
        // == compare strings for memory address
        // == do equality checks(compare value) with primitives 
        // equals() do equality checks(compare value) with strings

        // // substring
        String sss1 = "hello java";
        System.out.println(sss1.substring(2));
        System.out.println(sss1.substring(2,6));
        

    }
}
