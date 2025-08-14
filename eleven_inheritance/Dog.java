package eleven_inheritance;

public class Dog extends Animal {

    String animal = "Dog";

    public void display(){
        System.out.println("Dog Displayed");
    }

    // call super animal
    public void show() {
        display(); // same class
        super.display(); // super class
        System.out.println("Show Current Class Animal: "+animal);
        System.out.println("Show Super Class Animal: "+super.animal);
    }

}
