package Day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> ticketCounter = new LinkedList<>();

        ticketCounter.add("Order 1");
        ticketCounter.add("Order 2");
        ticketCounter.add("Order 3");
        ticketCounter.add("Order 4");

        System.out.println(ticketCounter);

        System.out.println(ticketCounter.peek());

        ticketCounter.poll();

        System.out.println(ticketCounter);
    }
}
