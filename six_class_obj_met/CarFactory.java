package six_class_obj_met;

public class CarFactory {

    // Data -> Instance Variables
    String carBrand;
    double carPrice;
    int carReviews;
    double carRating;

    // Static Data -> Fixed Data -> Static Variables
    static int  discountWebsite = 5;

    // Behavior Method Task
    public void displayCar_shortInfo(){
        
        String description = "A car is a vehicle that has wheels, carries a small number of passengers, and is moved by an engine or a motor. Cars are also called automobiles or motor vehicles. Trucks and buses are motor vehicles as well."; 
        System.out.println("When Hovered: ");
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Desc: "+description);
    }

    public void displayCar_completeInfo(){
        
        // System.out.println("Car Brand: "+carBrand);
        // System.out.println("Car Price: "+carPrice);
        System.out.println("When Clicked: ");
        displayCar_shortInfo(); // Reusing
        System.out.println("Car Reviews: "+carReviews);
        System.out.println("Car Ratings: "+carRating);
    }

}
