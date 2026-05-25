package Day5;

public record Demo() {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();

    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("I have connected your wifi and i am your custom thread");
    }
}

// t1.start() -> JVM ask OS to create a new thread -> Thread ko space milega ->
// Thread run() -> execute