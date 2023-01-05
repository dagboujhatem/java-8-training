public class Main {
    static void afficher(String msg){
        System.out.println(msg);
    }

    void affichage(String msg){
        System.out.println(msg);
    }
    Main (){
    }
    Main(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {

        Printer printer1 = message -> System.out.println( message);
        // 2nd way : using method reference
        // syntax => Class::method
        Printer printer2 = System.out::println;

        printer1.print("Bonjour tout le monde.");
        printer2.print("Good bye.");

        // Example 3: using static method
        Printer printer3 = Main::afficher;
        printer3.print("Print using method référence (static method).");

        // Example 4: using a method of a class
        Main main = new Main();
        Printer printer4 = main::affichage;
        printer4.print("Print using method référence (method of classe).");

        // Example 5: reference of a constructor
        Printer printer5 = Main::new;
        printer5.print("Print using method référence (constructor of classe).");
    }
}