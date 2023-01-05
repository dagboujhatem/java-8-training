public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Hello world!");
    }
}