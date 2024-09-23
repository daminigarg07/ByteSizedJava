import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Using streams to filter and print even numbers
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println); // Output: 2, 4
    }
}
