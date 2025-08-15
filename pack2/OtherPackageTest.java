package pack2;

import pack1.Person;

public class OtherPackageTest {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Different Package - Non-Subclass ");
        System.out.println(p.publicName);
        // We cannot access anything expect public if it's in a
        // different package and no inheritance
        // System.out.println(p.protectedName);
        // System.out.println(p.defaultName);
        // System.out.println(p.privateName);
    }

}
