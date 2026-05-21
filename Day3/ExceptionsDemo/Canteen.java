package Day3.ExceptionsDemo;

public class Canteen {
    public int orderBill;// class attributes

    public Canteen(int orderBill) {// para constructor
        this.orderBill = orderBill;
    }

    public void generateBill() throws InsuffiecientOrder {
        if (orderBill < 50) {
            throw new InsuffiecientOrder("Please order more food to generate bill!!");
        }
        System.out.println("Rs " + orderBill + " is you bill thank you for orderring!!!");
    }
}
