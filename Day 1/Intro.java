import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // int age = 25;
        // String name = "Pankaj";
        // double salary = 20000.30;

        String college = "";
        int age = 0;

        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        college = sc.nextLine();

        System.out.println("Your given name is " + college);

        System.out.println("Please enter your age");
        Scanner sc1 = new Scanner(System.in);
        age = sc1.nextInt();

        System.out.println("Your given age is " + age);

        System.out.println("End of code");

    }
}
