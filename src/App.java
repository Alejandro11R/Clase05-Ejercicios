import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);

        ShowMenu(scanner);

        whiletest();

        dowhileTests();

        forTest();
        pressEnter(scanner);

        System.out.println("Termino la aplicacion");
    }

    private static void ShowMenu(Scanner scanner) {

        int option;
        do {
            System.out.println("**********************************************************");
            System.out.println("Menu clase 5");
            System.out.println("**********************************************************");
            System.out.println("1. Prueba ciclo while");
            System.out.println("2. Prueba ciclo for");
            System.out.println("3. Prueba ciclo do while");
            System.out.println("Ingresa una opcion");

            option = scanner.nextInt();
            scanner.nextLine(); //Limpia el buffer
            switch (option) {

                case 1:
                    whiletest();
                    break;

                case 2:
                    forTest();
                    break;

                case 3:
                    dowhileTests();
                    break;
                case 0:
                    break;

                default:
                    System.err.println("ingrese una opcion valida");
                    break;

            }
        } while (option != 0);

    }

    private static void pressEnter(Scanner scanner) {
        System.out.println("Presione enter para continuar");
        scanner.nextLine();
    }
    private static void forTest() {
        for (int i = 0; i < 10; i += 3) {
            System.out.println(--i);
        }
        System.out.println("You win!");
    }

    private static void dowhileTests() {
        var counter = 5;
        do {
            System.out.println(counter);

            // Avance
            counter--;
        } while (counter > 0);
        System.out.println("Booom");
    }

    public static void whiletest() {
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;

        }
    }
}
