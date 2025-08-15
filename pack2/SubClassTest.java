package pack2;

import pack1.Person;

public class SubClassTest extends Person {

    public static void main(String[] args) {
        
        SubClassTest sct = new SubClassTest();
        System.out.println("Different Package - Sub Class");
        System.out.println((sct.publicName));
        System.out.println((sct.protectedName));
        // System.out.println((sct.defaultName));
        // System.out.println((sct.privateName));
        
    }

}
