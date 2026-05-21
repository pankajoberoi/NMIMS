package Day2.Inheri;

public class Honda extends Bike {
    public int rating;

    public Honda(int rating, int model, String color, int topSpeed) {
        super(model, color, topSpeed);
        this.rating = rating;
    }

    public void freeServices() {
        System.out.println("3 free services are available on your purchase");
    }
}
