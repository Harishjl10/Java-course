import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 7, 23, 56, 2, 89, 11, 5, 73 };

        // Call the methods to find the maximum and minimum values
        int max = Arrays.stream(numbers);
        int min = Arrays.stream(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
