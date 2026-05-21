package Day3.Overloading;

public class PaymentSevice {

    void pay(int amt) {
        System.out.println("cash payment success");
    }

    void pay(int amt, String UpiId) {
        System.out.println("UPI Payment Success");
    }

    void pay(int amt, double cardNumber) {
        System.out.println("CARD payment success");
    }
}
