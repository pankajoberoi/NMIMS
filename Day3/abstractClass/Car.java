package Day3.abstractClass;

public class Car extends Taxi {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    void start() {
        // TODO Auto-generated method stub
        System.out.println("Start with push button!!");

    }

    int calculateFare(int distance) {
        // TODO Auto-generated method stub
        return distance * 30;

    }

    int convertNumberplateCharges() {
        // TODO Auto-generated method stub
        return 2000;
    }

}
