package Nidhi.daily.program;

public class Consumer extends Thread {
    private Q obj;

    public Consumer(Q obj) {
        this.obj = obj; // Initialize shared resource Q
        start(); // Start the thread upon creation
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) { // Consumes 5 values
            try {
                Thread.sleep(3000); // Simulate some processing time
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            obj.get(); // Get value from shared resource Q
            i++;
        }
    }
}
