//custom template 
public class Student {
    // class attributes
    String FullName;
    int Rollno;
    String Email;

    public Student() {
        FullName = "User";
        Rollno = 420;
        Email = "user@gmail.com";
    }

    public Student(String userName, int userRoll, String userEmail) {
        FullName = userName;
        Rollno = userRoll;
        Email = userEmail;
    }

    // class methods
    public void fun() {
        System.out.println("Mai ayya hun aish karne! mera naam hai " + FullName);
    }

    public void sleep() {
        System.out.println("Meri marji jab marji so jaun!");
    }

}
