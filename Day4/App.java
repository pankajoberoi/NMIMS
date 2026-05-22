package Day4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        System.out.println(students.isEmpty());

        students.add("Pankaj");
        students.add("Sunil");
        students.add("Indira");
        students.add("Dhruv");

        System.out.println(students);
        System.out.println(students.get(2));

        students.remove(0);

        System.out.println(students);

        students.remove(1);

        System.out.println(students);

        students.set(1, "Dhruv kumar");

        System.out.println(students);

        System.out.println(students.contains("Sunil"));

        System.out.println(students.size());

        students.removeAll(students);

        System.out.println(students);

    }
}
