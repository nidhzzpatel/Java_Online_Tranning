package Nidhi.daily.program;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Inside run() Thread is alive or not? " + this.isAlive());
        int no = 0;
        while (no < 4) {
            no++;
            System.out.println("number = " + no);
            try {
                sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}
