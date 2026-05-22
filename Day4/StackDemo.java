package Day4;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> logs = new Stack<>();

        logs.push("Didi");
        logs.push("Manager");
        logs.push("Papa");
        logs.push("Manish");

        System.out.println(logs);

        logs.pop();

        System.out.println(logs);

        System.out.println(logs.peek());

    }
}
