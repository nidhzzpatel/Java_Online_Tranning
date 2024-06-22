package Nidhi.daily.program;

public class Producer extends Thread {
    private Q obj;

    public Producer(Q obj) {
        this.obj = obj; // Initialize shared resource Q
        start(); // Start the thread upon creation
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) { // Produces 5 values
            try {
                Thread.sleep(2000); // Simulate some processing time
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            obj.put(i); // Put value into shared resource Q
            i++;
        }
    }
}
