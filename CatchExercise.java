public class CatchExercise {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 5; // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}