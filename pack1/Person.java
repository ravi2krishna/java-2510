package pack1;

public class Person {

    public String publicName = "Public Name";
    protected String protectedName = "Protected Name";
    // if we don't use any access modifier, it's default only
    String defaultName = "Default Name"; 
    private String privateName = "Private Name";   
    
    // using all access modifiers
    public void display(){
        System.out.println("Inside Same Class");
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }

}
