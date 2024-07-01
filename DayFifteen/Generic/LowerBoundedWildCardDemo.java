package DayFifteen.Generic;



import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {
    private static final String LowerBoundedWildCard = null;

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer values");
        // Display List of Integers
        LowerBoundedWildCard.displayNumbers(intList);

        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0, 10, 4, 30);
        System.out.println("Display Number values");
        // Display List of Numbers
        LowerBoundedWildCard.displayNumbers(numberList);
    }
}
