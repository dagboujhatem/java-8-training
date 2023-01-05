public class Main {
    public static void main(String[] args) {
        Printer printer = (String message) -> System.out.println(message);
        printer.print("Hello world!");
    }
}