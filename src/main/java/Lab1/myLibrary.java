package Lab1;

/** Utility methods used by the COMP3111 Lab 1 application. */
public class myLibrary {

    /** Returns {@code base} raised to a non-negative integer exponent. */
    public static int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("The exponent must be non-negative.");
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /** Returns the factorial of a non-negative integer. */
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be non-negative.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private myLibrary() {
        // Utility class: do not instantiate.
    }
}
