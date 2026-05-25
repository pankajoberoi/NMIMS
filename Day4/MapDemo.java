package Day4;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Chutki");
        students.put(105, "Indumati");
        students.put(102, "Shizoka");

        System.out.println(students);

        System.out.println(students.containsKey(109));
        System.out.println(students.containsValue("Chutki"));

        System.out.println(students.keySet());

        students.replace(102, "Gandhi");

        System.out.println(students);

        students.remove(102);

        System.out.println(students);

        for (Entry<Integer, String> entry : students.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

    }
}
