package pack1;

public class SamePackageTest {
    public static void main(String[] args) {
        
        Person p = new Person();
        System.out.println("Same Package - Different Class");
        System.out.println(p.publicName); 
        System.out.println(p.protectedName); 
        System.out.println(p.defaultName); 
        // System.out.println(p.privateName); // private works only in same class 

    }
}
