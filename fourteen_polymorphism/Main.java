package fourteen_polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

    }
}
