import java.util.LinkedList;
import java.util.Queue;

public class StateQueue {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> states = new LinkedList<>();

        // Add states to the queue
        states.add("California");
        states.add("Texas");
        states.add("New York");
        states.add("Florida");
        states.add("Illinois");

        // Print the states in the queue
        System.out.println("States in the queue:");
        for (String state : states) {
            System.out.println(state);
        }

        // Optionally, demonstrate queue operations
        System.out.println("\nPerforming queue operations:");
        while (!states.isEmpty()) {
            System.out.println("Removing: " + states.poll());
        }
    }
}
