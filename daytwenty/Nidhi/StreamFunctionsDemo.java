package daytwenty.Nidhi;



import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionsDemo {
    private static Stream<String> stream;

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"); // source
        System.out.println("List of Cities is " + strList);

        // retrieve the streamStream<String> stream = strList.stream();

        // Counting the empty strings
        long count = countEmptyStrings(stream);
        System.out.printf("List %s has %d empty strings \n", strList, count);
        // System.out.println("List "+strList+" has "+count+" empty strings");

        // Counting String with length more than 8*

        count = countStrings(strList.stream(), 8);
        System.out.printf("List %s has %d strings of length more than 8 \n", strList, count);

        // Remove all empty Strings from List*
        List<String> filteredList = nonEmptyStringList(strList.stream());
        System.out.printf("Original List : %s, List without Empty Strings : %s \n", strList, filteredList);

        // Strings with length more than 6
        filteredList = getStrings(strList.stream(), 6);
        System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        // retrieve the stream
        Stream<Integer> stream1 = numbers.stream();

        // List of square of all distinct numbers
        List<Integer> filteredNumberList = getSquareList(stream1);
        System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

        // Get count, min, max, sum, and average for numbers
        showStatistics(numbers.stream());

    }

    // Counting the empty strings
    public static long countEmptyStrings(Stream<String> stream) {
        return stream.filter(str -> str.isEmpty()).count();
    }

    // Count strings of a given length
    public static long countStrings(Stream<String> stream, int length) {
        return stream.filter(str -> str.length() > length).count();
    }

    // Return a list without empty strings
    public static List<String> nonEmptyStringList(Stream<String> stream) {
        return stream.filter(str ->!str.isEmpty()).collect(Collectors.toList());
    }

    // Return a list of strings with length more than given length
    public static List<String> getStrings(Stream<String> stream, int length) {
        return stream.filter(str -> str.length() > length).collect(Collectors.toList());
    }

    // Return list of squares of all distinct numbers
    public static List<Integer> getSquareList(Stream<Integer> stream) {
        return stream.distinct().map(num -> num * num).collect(Collectors.toList());
    }

    // Get count, min, max, sum, and average for numbers
    public static void showStatistics(Stream<Integer> stream) {
        IntSummaryStatistics stats = stream.mapToInt(x -> x).summaryStatistics();
        System.out.printf("Count: %d, Min: %d, Max: %d, Sum: %d, Average: %.2f %n", stats.getCount(),
                stats.getMin(), stats.getMax(), stats.getSum(), stats.getAverage());
    }

}