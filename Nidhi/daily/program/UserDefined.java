package Nidhi.daily.program;

public class UserDefined {

    public static boolean validateMarks(int[] marks) throws InvalidMarksException {
        for(int value : marks) {
            if(value < 0 || value > 100)
                throw new InvalidMarksException("Marks should be between 0 to 100");
        }
        return true;
    }

    public static float calculatePercentage(int[] marks) {
        int total = 0;
        for(int result : marks) {
            total += result;
        }
        float per = (float) total / marks.length;
        return per;
    }

    // Define the custom exception
    public static class InvalidMarksException extends Exception {
        public InvalidMarksException(String message) {
            super(message);
        }
    }

    // A main method to test the functionality
    public static void main(String[] args) {
        try {
            int[] marks = {85, 90, 78, 92, 88};
            validateMarks(marks);
            System.out.println("Percentage: " + calculatePercentage(marks));
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
