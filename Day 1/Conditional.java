import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        int num = 0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reveresed number is " + reverse);
    }
}
