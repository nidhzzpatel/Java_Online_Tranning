// UsingRunnable.java

package Nidhi.daily.program;

public class UsingRunnable implements Runnable {
    private Thread thread;
    private int high, low;
    private String msg;

    public UsingRunnable(int low, int high, String msg) {
        this.high = high;
        this.low = low;
        this.msg = msg;
        thread = new Thread(this, "Child Thread");
        thread.start();
    }

    @Override
    public void run() {
        for (int i = low; i <= high; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error " + e.getMessage());
            }
            System.out.println(msg + i);
        }
    }
}
