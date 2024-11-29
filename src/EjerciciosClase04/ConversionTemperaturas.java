package EjerciciosClase04;

import java.util.Scanner;

public class ConversionTemperaturas {

    public static double CelsiusAfahrenheit(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Interaction con el usuario para la conversion de celsius a Fahrenheit
        System.out.println("Enter the temperature in Celsius:");
        var Celsius = scanner.nextDouble();
        var fahrenheit = CelsiusAfahrenheit(Celsius);
        System.out.println("The temperature in fahrenheit is: "+ fahrenheit);

        //Interaction con el usuario para la conversion de Fahrenheit a celsius
        System.out.println("Enter the temperature in fahrenheit:");
        var fahrenheit2 = scanner.nextDouble();
        var celsius = fahrenheitACelsius(fahrenheit2);
        System.out.println("The temperature in celsius is: "+ celsius);

        scanner.close();
    }
}