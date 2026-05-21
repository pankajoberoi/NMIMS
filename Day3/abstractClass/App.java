package Day3.abstractClass;

public class App {
    public static void main(String[] args) {
        Taxi bike = new Bike("123MH2050");
        bike.vehicleInfo();

        System.out.println("Your fare is " + bike.calculateFare(5));

        // System.out.println("Coverstion chargers are " +
        // bike.convertNumberplateCharges());

        // bike.start();

        Taxi maruti = new Car("9090MH2040");

        maruti.vehicleInfo();

        System.out.println(maruti.calculateFare(5));

    }
}
