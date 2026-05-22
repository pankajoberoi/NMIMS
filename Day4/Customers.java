package Day4;

public class Customers {
    public int custId;
    public String name;
    public String date;

    public Customers(int UsercustId, String Username, String Userdate) {
        custId = UsercustId;
        name = Username;
        date = Userdate;
    }

    @Override
    public String toString() {
        return "Customer[custId=" + custId + ", name=" + name + " , date " + date + "]" + "\n";
    }

}
