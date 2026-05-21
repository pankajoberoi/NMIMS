package Day2.Encap;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HDFC cust1 = new HDFC("Pankaj", "qwe123", 200, "Student");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println("Press 1 for deposit");
            System.out.println("Press 2 for withdraw");
            System.out.println("Press 3 for balance");
            System.out.println("Press 4 for exit");

            input = sc.nextInt();

            switch (input) {
                case 1:
                    int depositAmt = 0;
                    System.out.println("Please neter the amount to deposit");
                    depositAmt = sc.nextInt();
                    cust1.deposit(depositAmt);
                    break;
                case 2:
                    int withdrawAmt = 0;
                    System.out.println("Please enter the amt to withdraw");
                    withdrawAmt = sc.nextInt();

                    cust1.withdraw(withdrawAmt);

                    break;

                case 3:
                    System.out.println(cust1.showBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the system");
                    break;

                default:
                    System.out.println("Abee adnha hai kya!!!");
                    break;
            }

        }
    }
}
