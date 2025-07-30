package six_class_obj_met;

// For Types Of Variables demo
public class Car {

    // Instance Variables
    String brand;
    int year;
    double price;

    // method to demo local variables
    public void showDetails(){
        // Local Variables
        double rating=4.5;
        String color = "Black";
        System.out.println("Color: "+color);
        System.out.println("Rating: "+rating);
    }

    // Static Variables
    static double globalDiscount = 10;


    public static void main(String[] args) {
        System.out.println("========Car Details========");
        Car honda = new Car();
        honda.brand = "Honda";
        honda.year = 2023;
        honda.price = 20.5;

        System.out.println("========Honda Car========");
        System.out.println("Car Brand: "+honda.brand);
        System.out.println("Car Year: "+honda.year);
        System.out.println("Car Price: "+honda.price);
        honda.showDetails();
        System.out.println("Discount Given: "+Car.globalDiscount);


        Car tata = new Car();
        tata.brand = "Tata";
        tata.year = 2024;
        tata.price = 25;

        System.out.println("========Tata Car========");
        System.out.println("Car Brand: "+tata.brand);
        System.out.println("Car Year: "+tata.year);
        System.out.println("Car Price: "+tata.price);
        tata.showDetails();
        System.out.println("Discount Given: "+Car.globalDiscount);



    }

}
