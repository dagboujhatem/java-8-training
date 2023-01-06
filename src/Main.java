import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //  Interface "Predicate"
        Predicate<String> hasLeftParenthesis = (str) -> str.startsWith("(");
        Predicate<String> hasRightParenthesis = (str) -> str.endsWith(")");
        // && AND logic
        Predicate<String> hasParentheses = hasLeftParenthesis.and(hasRightParenthesis);
        // || OR logic
        Predicate<String> hasAtLeastParenthesis = hasLeftParenthesis.or(hasRightParenthesis);
        // ! NOT logic
        Predicate<String> negate = hasAtLeastParenthesis.negate();

        // Test
        System.out.println(hasAtLeastParenthesis.test("(Hello"));
        System.out.println(hasParentheses.test("(Hello"));
        System.out.println(negate.test("(Hello"));

    }
}