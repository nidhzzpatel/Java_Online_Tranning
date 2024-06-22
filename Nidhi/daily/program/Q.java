package Nidhi.daily.program;

public class Q {
    private int n;
    private boolean valueSet = false;

    public synchronized void put(int n) {
        if (valueSet) {
            try {
                wait(); // Wait if value is already set
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put : " + n);
        notify(); // Notify waiting thread (get method)
    }

    public synchronized void get() {
        if (!valueSet) {
            try {
                wait(); // Wait if value is not set yet
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Getting data : " + n);
        valueSet = false;
        notify(); // Notify waiting thread (put method)
    }
}
