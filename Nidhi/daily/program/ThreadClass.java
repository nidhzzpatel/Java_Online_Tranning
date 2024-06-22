package Nidhi.daily.program;

public class ThreadClass extends Thread {
    private int count;
    private String threadName;

    public ThreadClass(int count, String threadName) {
        this.count = count;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + threadName);
        try {
            for (int i = 1; i <= count; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000); // simulate some task
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println("Thread finished: " + threadName);
    }
}
