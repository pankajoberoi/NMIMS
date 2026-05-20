package Day2;

public class HDFC {
    public String Name; // class attribute -> obj -> cust1
    public String AccNo;
    public int balance;

    public HDFC(String Name, String AccNo, int balance) {// local variables
        // this -> current obj -> cust1 -> class attribute
        this.Name = Name;
        this.AccNo = AccNo;
        this.balance = balance;
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
}
