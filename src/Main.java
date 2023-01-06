import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monday", "Tuesday", "Sunday");
        // Create Consumers
        Consumer<String> print = System.out::println;
        Consumer<String> printLowerCase = item -> System.out.println(item.toLowerCase());
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        // Chaining Consumers
        list.forEach(print.andThen(printLowerCase).andThen(printUpperCase));

    }
}