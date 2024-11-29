package EjerciciosClase04;

import java.util.Scanner;

public class NumerosPrimos {


    //Metodo para verificar si un numero es primo
    public static boolean esprimo(int numero) {

        if (numero<=1) {
            return false;//Los numeros menores o iguales a 1 no son primos

        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero% i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
    
        //SOlicitar al ususario que ingrese un numero entero positivo
        System.out.println("Enter a positive  integer ");
        var numero =scanner.nextInt();

        //verificar si el numero es primo
        if (esprimo((numero))) {
            System.out.println("the numer "+ numero+" is a prime number");

        }else {
            System.out.println("The number" + numero + " is not a prime number");
        }
        scanner.close();
    }
}
