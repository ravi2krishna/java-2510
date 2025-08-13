package eleven_inheritance;

public class CustomUser implements Watchable, Addable {
    public static void main(String[] args) {
        
    }
    public void addVideo() {
        System.out.println("Add Video");
    }

    public void watchVideo() {
        System.out.println("Watch Video");
    }
}
