package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DMart {
    public static void main(String[] args) {
        // ArrayList<Customers> Clist = new ArrayList<>();
        // Clist.add(new Customers(101, "Pankaj", "22-05-25"));
        // Clist.add(new Customers(104, "Shiv", "23-05-25"));
        // Clist.add(new Customers(103, "Shyam", "24-05-25"));
        // Clist.add(new Customers(102, "Saachi", "24-05-25"));

        ArrayList<Customers> NewClist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (true) {
            System.out.println("Press 1 to add new customer and 0 to exit");
            input = sc.nextInt();
            if (input == 1) {
                System.out.println("Enter you custId , Name , date and rating");
                int custId = sc.nextInt();
                sc.nextLine();// enter
                String name = sc.nextLine();
                String date = sc.nextLine();
                int rating = sc.nextInt();
                Customers cust = new Customers(custId, name, date, rating);
                NewClist.add(cust);
            } else {
                break;
            }

        }

        for (Customers client : NewClist) {
            System.out.println(client);
        }

        Collections.sort(NewClist, new RatingComparator());

        System.out.println("=================================================");

        for (Customers client : NewClist) {
            System.out.println(client);
        }

    }
}
