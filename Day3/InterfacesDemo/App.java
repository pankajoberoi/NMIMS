package Day3.InterfacesDemo;

public class App {
    public static void main(String[] args) {
        SmartDevice sony = new SmartTv();

        sony.connectWifi();

        sony.disconnectWifi();

        SmartDevice apple = new SmartWatch();

        apple.connectWifi();

        apple.disconnectWifi();
    }
}
