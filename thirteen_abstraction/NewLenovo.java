package thirteen_abstraction;

// public class NewLenovo implements Laptop { } --> concrete class

// lets make a abstract class
public abstract class NewLenovo implements Laptop {

    public void usbSlot(){
        System.out.println("New Lenovo USB Slot");
    }

    public void hdmiSlot() {
        System.out.println("New Lenovo HDMI Slot");
    }

    public abstract void cPort();

    public void concreteMethod() {
        System.out.println("Concrete Method");
    }

}
