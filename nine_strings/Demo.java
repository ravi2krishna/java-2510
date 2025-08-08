package nine_strings;

public class Demo {
    public static void main(String[] args) {
        // int i = 10;
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
        
        // String Immutability Test
        String greet = "hello";
        System.out.println(greet.concat(" good morning"));
        System.out.println(greet); // original string never changed/modified

        // String vs String Buffer vs String Builder
        long startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str = str + " Programming";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Time Taken Using Strings: "+(stopTime-startTime));

        // StringBuilder ssb = new StringBuilder("Hello");
        // System.out.println(ssb.append(" World"));
        
        // String Builder
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            strBuilder.append(" Programming");
        }
        long stopTimeBuilder = System.currentTimeMillis();
        System.out.println("Time Taken Using String Builder: "+(stopTimeBuilder-startTimeBuilder));

        // StringBuffer ssbuf = new StringBuffer("Hello");
        // System.out.println(ssbuf.append(" World"));
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer strBuffer= new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            strBuffer.append(" Programming");
        }
        long stopTimeBuffer = System.currentTimeMillis();
        System.out.println("Time Taken Using String Buffer: "+(stopTimeBuffer-startTimeBuffer));

    }
}
