import java.util.*;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String[] inputs = {"10", "20", "30", "40", "50"}; // Test Case 1

        // Parsing strings and adding valid integers to the list
        for (String input : inputs) {
            Integer num = parseStringToInteger(input);
            if (num != null) {
                numbers.add(num); // Autoboxing: int -> Integer
            }
        }

        // Calculating sum using loop
        int sumUsingLoop = calculateSum(numbers);
        System.out.println("The sum of the list (using loop) is: " + sumUsingLoop);

        // Calculating sum using Java 8 Streams
        int sumUsingStream = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum of the list (using stream) is: " + sumUsingStream);
    }

    // Method to parse strings into Integer objects
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); // Parsing string to Integer
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    // Method to calculate the sum using a loop (demonstrating unboxing)
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer -> int
        }
        return sum;
    }
}
