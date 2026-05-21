package Day3.abstractClass;

public abstract class Taxi {
    String vehicleNumber;

    public Taxi(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    void vehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
    }

    // abstract method
    abstract void start();

    abstract int calculateFare(int distance);

    abstract int convertNumberplateCharges();
}
