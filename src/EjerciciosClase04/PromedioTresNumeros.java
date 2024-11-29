package EjerciciosClase04;

import java.util.Scanner;

public class PromedioTresNumeros {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        //Pedir al ususario que ingrese tres numeros
        System.out.println("Enter  the first number:");
        var numero1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        var numero2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        var numero3 = scanner.nextDouble();


        //Calcular promedio 
        double promedio= calcularPromedio(numero1, numero2, numero3); 
        
        System.out.println("The average of the three numbers is: "+promedio);
        
        scanner.close();
    }

    // Metodo para calcular el promedio de tres numeros
    public static double calcularPromedio(double numero1, double numero2, double numero3) {
        return(numero1+numero2+numero3)/3;
    }
}
