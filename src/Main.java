import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Interface "BinaryOperator"
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        Function<Integer, Integer> multiplyBy10 = (x) -> multiply.apply(x,10);
        // Test
        System.out.println(multiply.apply(5,4));
        System.out.println(multiplyBy10.apply(5));

        var result = multiply.andThen(multiplyBy10).apply(5,6);
        System.out.println(result);

    }
}