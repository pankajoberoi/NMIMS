package Day4;

public class Customers implements Comparable<Customers> {
    public int custId;
    public String name;
    public String date;
    public int rating;

    public Customers(int UsercustId, String Username, String Userdate, int Userrating) {
        custId = UsercustId;
        name = Username;
        date = Userdate;
        rating = Userrating;
    }

    @Override
    public String toString() {
        return "custId=" + custId + "- name = " + name + "- date = " + date + "- rating = " + rating + "]" + "\n";
    }

    @Override
    public int compareTo(Customers e) {
        return this.name.compareTo(e.name);
    }

}
