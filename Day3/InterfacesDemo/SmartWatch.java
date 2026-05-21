package Day3.InterfacesDemo;

public class SmartWatch implements SmartDevice {

    public void connectWifi() {
        System.out.println("SmartWatch connect with wifi through fingerTouch");
    }

    public void disconnectWifi() {
        System.out.println("SmartWatch Disconnect from wifi through fingerTouch");

    }

}
