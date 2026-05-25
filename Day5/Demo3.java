package Day5;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " from thread one");
                }

            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " from thread two");
                }

            }

        });

        t1.start();
        t2.start();
    }
}
