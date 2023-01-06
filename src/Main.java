import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // create a Function (Supplier & Consumer in the same time)
        Function<String,Integer> function = (param) -> Integer.parseInt(param);
        System.out.println(function.apply("34"));;

        Function<String, Character> getFirstChar = (str) -> str.charAt(0);
        System.out.println(getFirstChar.apply("Hatem"));

    }
}