package six_class_obj_met;

public class ActualCars {

    static int data = 10;
    public static void main(String[] args) {
        CarFactory cretaCar = new CarFactory();
        cretaCar.carBrand = "Hyundai";
        cretaCar.carPrice = 20.50;
        cretaCar.carRating = 4.6;
        cretaCar.carReviews = 410;
        // cretaCar.displayCar_shortInfo();
        // cretaCar.displayCar_completeInfo();
        System.out.println(data);

        CarFactory scorpioCar = new CarFactory();
        scorpioCar.carBrand = "Mahindra";
        scorpioCar.carPrice = 17.71;
        scorpioCar.carRating = 4.7;
        scorpioCar.carReviews = 491;
        scorpioCar.displayCar_shortInfo();
        scorpioCar.displayCar_completeInfo();    

    }
}
