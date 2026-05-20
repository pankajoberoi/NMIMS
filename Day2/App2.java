package Day2;

public class App2 {
    public static void main(String[] args) {
        HDFC cust = new HDFC("Sunil", "1235HDFC", 500, "Manager");

        cust.getName();
        cust.getBranchCode();
        cust.setBranchCode("XYZ321");
        cust.getBranchCode();
    }

}
