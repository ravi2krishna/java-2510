package thirteen_abstraction;

public class Dell implements Laptop {

    public void usbSlot(){
        System.out.println("Dell USB Slot");
    }

    public void hdmiSlot() {
        System.out.println("Dell HDMI Slot");
    }

    public void cPort() {
        System.out.println("Dell C Slot");
    }

    // Additional Features
    public void audioJack() {
        System.out.println("Audio Jack");
    }

    // Dell's version of microsdSlot
    public void microsdSlot(){
        System.out.println("Dell Provided Own Micro SD Slot");
    }

    // Dell's version of ethernetSlot
    public void ethernetSlot(){
        System.out.println("Dell Provided Own Ethernet Slot");
    }

}
