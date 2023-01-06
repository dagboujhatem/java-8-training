import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // create a Supplier
        Supplier<Integer> supplier = ()-> LocalDateTime.now().getYear();
        System.out.println("Years : " + supplier.get());

        IntSupplier supplier2 = ()-> LocalDateTime.now().getMinute();
        System.out.println("Minutes : " + supplier2.getAsInt());

    }
}