package Day3.ExceptionsDemo;

public class Index2 {
    public static void main(String[] args) {
        Canteen order1 = new Canteen(40);

        try {
            order1.generateBill();
        } catch (InsuffiecientOrder e) {
            System.out.println(e);
        }

    }
}
