package Nidhi.daily.program;

public class Synchronization {

    public static void main(String[] args) {
        Account acc = new Account(101, "John Doe", 50000);
        System.out.println("Initial Account Details:");
        System.out.println(acc);

        // Create multiple threads to perform deposit and withdrawal operations
        AccountThread thread1 = new AccountThread(acc, 20000);
        AccountThread thread2 = new AccountThread(acc, -30000);

        // Wait for both threads to complete using join
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final Account Details:");
        System.out.println(acc);
    }
}
