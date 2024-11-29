package EjerciciosClase04;

import java.util.Scanner;

public class ConversionUnidades {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Select the type of conversion");
        System.out.println("1. Metros a Kilometros");
        System.out.println("2. Kilometros a Metros");
        System.out.println("3. Gramos a kilogramos");
        System.out.println("4. Kilogramos a Gramos");

        var opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad en metros: ");
                double metros = scanner.nextDouble();
                double kilometros = metrosAKilometros(metros);
                System.out.println(metros + " metros son " + kilometros + " kilómetros.");
                break;
            case 2:
                System.out.print("Ingrese la cantidad en kilómetros: ");
                double kms = scanner.nextDouble();
                double metrosConvertidos = kilometrosAMetros(kms);
                System.out.println(kms + " kilómetros son " + metrosConvertidos + " metros.");
                break;
            case 3:
                System.out.print("Ingrese la cantidad en gramos: ");
                double gramos = scanner.nextDouble();
                double kilogramos = gramosAKilogramos(gramos);
                System.out.println(gramos + " gramos son " + kilogramos + " kilogramos.");
                break;
            case 4:
                System.out.print("Ingrese la cantidad en kilogramos: ");
                double kgs = scanner.nextDouble();
                double gramosAKilogramos = kilogramosAGramos(kgs);
                System.out.println(kgs + " kilogramos son " + gramosAKilogramos + " gramos.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }

    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    // Método para convertir kilómetros a metros
    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    // Método para convertir gramos a kilogramos
    public static double gramosAKilogramos(double gramos) {
        return gramos / 1000;
    }

    // Método para convertir kilogramos a gramos
    public static double kilogramosAGramos(double kilogramos) {
        return kilogramos * 1000;
    }
}
