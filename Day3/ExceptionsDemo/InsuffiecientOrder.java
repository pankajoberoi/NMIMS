package Day3.ExceptionsDemo;

public class InsuffiecientOrder extends Exception {
    InsuffiecientOrder(String message) {
        super(message);
    }
}
