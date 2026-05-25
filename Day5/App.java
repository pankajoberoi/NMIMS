package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        // String str1 = "Pankaj";

        // String str2 = "Pankaj";

        // System.out.println(str1 == str2);

        // String str3 = new String("NMIMS");

        // String str4 = new String("NMIMS");

        // String str5 = "NMIMS";

        // System.out.println(str3.equals(str4));

        // System.out.println(str5 == str3);

        Employee sunil = new Employee();
        sunil.score = 21;

        Employee dhruv = new Employee();
        dhruv.score = 30;

        Employee gandhi = new Employee();
        gandhi.score = 40;

        ArrayList<Employee> EmpList = new ArrayList<>();

        EmpList.add(gandhi);
        EmpList.add(sunil);
        EmpList.add(dhruv);

        System.out.println(EmpList);

        Collections.sort(EmpList);

        System.out.println(EmpList);

    }
}
