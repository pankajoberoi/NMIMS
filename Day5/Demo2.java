package Day5;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnableThread r1 = new MyRunnableThread();
        Thread t1 = new Thread(r1);

        t1.start();
    }
}

// Thread using Runnable interface

class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("I have connected your wifi and i am your runnable thread");

    }

}
