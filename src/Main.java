import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Interface "UnaryOperator"
        UnaryOperator<Integer> cube = a -> a*a*a;
        UnaryOperator<Integer> increment = a -> a+1;

        // Test
        var result = cube.andThen(increment).apply(5);
        System.out.println(result);

    }
}