package thirteen_abstraction;

public class User {

    public static void main(String[] args) {
        
        Lenovo lenovo = new Lenovo();
        System.out.println("Buying Lenovo Laptop");
        lenovo.usbSlot();
        lenovo.hdmiSlot();
        lenovo.cPort();
        lenovo.microsdSlot();

        System.out.println("Buying Dell Laptop");
        Dell dell = new Dell();
        dell.usbSlot();
        dell.hdmiSlot();
        dell.cPort();
        dell.audioJack();
        dell.microsdSlot();
        dell.ethernetSlot();
        Laptop.ethernetSlot();

    }

    
    


}
