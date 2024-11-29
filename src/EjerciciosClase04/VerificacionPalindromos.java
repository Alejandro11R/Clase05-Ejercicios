package EjerciciosClase04;

import java.util.Scanner;

public class VerificacionPalindromos {

    // Metodo para verificar si una cadena es un palindromo
    public static boolean esPalindromo(String palabra) {
        // Eliminar espacion y puntuacion, y converitr a minusculas
        String palabraSinEspacios = palabra.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String palabraInvertida = new StringBuilder(palabraSinEspacios).reverse().toString();
        return palabraSinEspacios.equals(palabraInvertida);

    }

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        // Interaccion con el usuario
        System.out.println("Enter a string");
        var palabra = scanner.nextLine();

        // Verificacion de palindromo
        if (esPalindromo(palabra)) {
            System.out.println("The string is a palindrome ");
        } else {
            System.out.println("The string is not a palindrome ");
        }
        scanner.close();

    }
}