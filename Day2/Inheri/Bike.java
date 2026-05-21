package Day2.Inheri;

public class Bike extends Vehicle {
    public String color;
    public int topSpeed;

    public Bike(int model, String color, int topSpeed) {
        super(model);
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void wheelie() {
        System.out.println("Dhoom machaleee!!!");
    }

    public void showBikeDetails() {
        System.out.println(color + " " + topSpeed + " " + model);
    }

}
