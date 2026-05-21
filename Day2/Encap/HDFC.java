package Day2.Encap;

public class HDFC {
    private String Name; // class attribute -> obj -> cust1
    private String AccNo;
    private String role;
    private int balance;
    private String BranchCode = "AEF123";

    public HDFC(String Name, String AccNo, int balance, String role) {// local variables
        // this -> current obj -> cust1 -> class attribute
        this.Name = Name;
        this.AccNo = AccNo;
        this.balance = balance;
        this.role = role;
    }

    // class Methods
    public int showBalance() {
        return this.balance;
    }

    public void withdraw(int amt) {
        if (this.balance > amt) {
            balance = balance - amt;
        } else {
            System.out.println("Chal bee gareeb!!!! , account mai sirf " + balance + " paise hai");
        }
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("amount credited!!!");
    }

    public void getBranchCode() {
        System.out.println(Name + " " + BranchCode);
    }

    public void setBranchCode(String code) {
        if (role.equals("Manager")) {
            this.BranchCode = code;
        } else {
            System.out.println("You are not authorized to change branch code");
        }
    }

    public void getName() {
        System.out.println("Your name is " + Name);
    }

}
