package Day3.ExceptionsDemo;

public class Index {

    static void validateAge(int birthyear) {
        int age = 2026 - birthyear;
        if (age < 18) {
            throw new ArithmeticException("Your age is less to vote");
        }
        System.out.println("You are eligible to vote");
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 1;
        try {
            System.out.println(num1 / num2);
            validateAge(2010);
        } catch (ArithmeticException e) {
            System.out.println("Bhai kuch to dikat hai !!! " + e);
        }

    }
}
