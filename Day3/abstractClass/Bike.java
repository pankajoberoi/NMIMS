package Day3.abstractClass;

public class Bike extends Taxi {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    void start() {
        System.out.println("Bike started with key!!");
    }

    int calculateFare(int distance) {
        return distance * 5;
    }

    int convertNumberplateCharges() {
        return 500;
    }

}
