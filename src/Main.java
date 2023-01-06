import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //  Interface "Predicate"
        Predicate<String> hasLengthEven = (str) -> str.length() % 2 == 0;
        System.out.println(hasLengthEven.test("hello")); // Output false
        System.out.println(hasLengthEven.test("hello!")); // Output true

    }
}