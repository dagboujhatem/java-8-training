import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monday", "Tuesday", "Sunday");
        // imperative approach (using imperative programming)
        // C'est-à-dire lorsque tu programme une solution, tu dois dire comment la faire (itérer le tableau)
        for (String day: list) {
            System.out.println(day);
        }

        // Declarative approach (using declarative programming)
        // C'est-à-dire lorsque tu programme une solution, dire à Java ce nous voudrons faire s ns le dire comment la faire
        // c'est à lui de savoir comment faire les choses (sans itérer le tableau)
        list.forEach(day -> System.out.println(day));
        list.forEach(System.out::println);

    }
}