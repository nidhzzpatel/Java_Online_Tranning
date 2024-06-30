import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> numbers = new ArrayList<>();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'done' to finish):");
        
        // Read user input until "done" is entered
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }

        // Initialize sum for even numbers
        int sumOfEvenNumbers = 0;

        // Iterate through the list
        for (int number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }

        // Print the sum of even numbers
        System.out.println("Sum of all even numbers: " + sumOfEvenNumbers);
        
        // Close the scanner
        scanner.close();
    }
}
