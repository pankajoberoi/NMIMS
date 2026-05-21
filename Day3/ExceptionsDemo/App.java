package Day3.ExceptionsDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("hello ji");
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        try {
            System.out.println("Enter num1");
            num1 = sc.nextInt();

            System.out.println("Enter num2");
            num2 = sc.nextInt();
            System.out.println(num1 / num2);

        } catch (ArithmeticException pankaj) {
            System.out.println("PLease dont divide a no by 0 " + pankaj);
        } catch (InputMismatchException aarav) {
            System.out.println("PLease enter valid numbers!!");
        }

        finally {
            System.out.println("System is disconneted from database");
        }
    }
}
