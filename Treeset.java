import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        // Create a TreeSet to store numbers divisible by 5
        TreeSet<Integer> numbers = new TreeSet<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (5 numbers divisible by 5):");

        // Loop until we have 5 numbers in the set
        while (numbers.size() < 5) {
            System.out.print("Enter a number: ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number % 5 == 0) {
                    numbers.add(number);
                } else {
                    System.out.println("The number is not divisible by 5. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }

        // Print the numbers in the TreeSet
        System.out.println("Numbers in the TreeSet (divisible by 5): " + numbers);

        // Close the scanner
        scanner.close();
    }
}
