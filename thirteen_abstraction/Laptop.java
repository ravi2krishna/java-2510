package thirteen_abstraction;

public interface Laptop {

    // Every Laptop Must Have Below Features
    // Any Vendor Who Wants To Build a Laptop 
    // Should be bind by this contract (Laptop Interface)
    // this was in 2010's

    public void usbSlot();

    public void hdmiSlot();

    public void cPort();


    // now we are in 2020's 
    // complaint from vendors -> we are not ready yet with this tech
    default void microsdSlot(){
        System.out.println("Government Provided Micro SD Slot");
    }

    // here it's not mandatory to follow this
    // if you want directly use Interface name and call static method
    static void ethernetSlot(){
        System.out.println("Government Provided Ethernet Slot");
    }

    // concrete method -> Not allowed
    // public void addNums() {
        
    // }

}
