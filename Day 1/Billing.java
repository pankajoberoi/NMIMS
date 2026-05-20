import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {

        String customerStatus = "";
        int TotalKamai = 0;
        int currentBill = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Do we have a customer");
        customerStatus = sc.next();

        if (customerStatus.equals("Yes")) {
            do {
                System.out.println("Please enter total bill of customer");
                currentBill = sc.nextInt();
                TotalKamai = TotalKamai + currentBill;
                System.out.println("Do we have next customer");
                customerStatus = sc.next();

            } while (customerStatus.equals("Yes"));
        }
        System.out.println("Aaj ke din ke kamai is " + TotalKamai);

    }
}
