package thirteen_abstraction;

// implement contact (Laptop Interface)
public class Lenovo implements Laptop {

    public void usbSlot(){
        System.out.println("Lenovo USB Slot");
    }

    public void hdmiSlot() {
        System.out.println("Lenovo HDMI Slot");
    }

    public void cPort() {
        System.out.println("Lenovo C Slot");
    }

}
