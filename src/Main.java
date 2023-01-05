public class Main {
    static String prefix = "Message : ";
    String supparateur;

    void test(String msg){
        // accès a un attribut en utilisant this
        Printer printer = message -> System.out.println(Main.prefix + this.supparateur + message);
        printer.print(msg);
    }
    public static void main(String[] args) {
        String suffix = " ?";
        // les attributs de classe
        Main main = new Main();
        main.supparateur = " => ";
        // static attribute
        // class attribute
        // Simple variable
        Printer printer = message -> System.out.println(Main.prefix + main.supparateur + message+suffix);
        printer.print("Hello world");

        // Example 2:  access using this keyword
        main.test("hello");


    }
}