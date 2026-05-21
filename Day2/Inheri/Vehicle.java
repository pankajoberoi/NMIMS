package Day2.Inheri;

public class Vehicle {
    public int model;

    public Vehicle(int model) {
        this.model = model;
    }

    public void StartEngine() {
        System.out.println("Starting your Engine!!");
    }

    public void StopEngine() {
        System.out.println("Engine Stopping!!");
    }

}
