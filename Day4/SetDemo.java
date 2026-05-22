package Day4;

import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet<String> emails = new HashSet<>();

        // emails.add("a@gmail.com");
        // emails.add("b@gmail.com");
        // emails.add("a@gmail.com");

        // System.out.println(emails);

        // LinkedHashSet<Integer> marks = new LinkedHashSet<>();

        // marks.add(40);
        // marks.add(10);
        // marks.add(30);
        // marks.add(40);

        // System.out.println(marks);

        TreeSet<Integer> salaries = new TreeSet<>();

        salaries.add(2000);
        salaries.add(500);
        salaries.add(4000);
        salaries.add(1000);
        salaries.add(2000);

        System.out.println(salaries);

    }
}
