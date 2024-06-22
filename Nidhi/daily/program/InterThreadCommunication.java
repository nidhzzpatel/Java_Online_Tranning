package Nidhi.daily.program;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q(); // Shared resource Q
        Producer producer = new Producer(q); // Producer thread
        Consumer consumer = new Consumer(q); // Consumer thread

        try {
            producer.join(); // Wait for producer to finish
            consumer.join(); // Wait for consumer to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread exiting...");
    }
}
