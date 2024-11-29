package EjerciciosClase04;

import java.util.Scanner;

public class CalculoPotencias {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese la base y el exponente
        System.out.println("Enter The Base:");
        var base = scanner.nextDouble();

        System.out.println("Enter the exponent:");
        var exponente = scanner.nextInt();

        //Calcular la potencia
        var potencia = CalcularPotencia(base, exponente);

        //Mostrar el resultado
        System.out.println(base + " elevado a la " + exponente + " es igual a"+ potencia);

        scanner.close();


    }
    //Metodo para calulcar la potencia
    public static double CalcularPotencia(double base, int exponente){
        if (exponente==0) {
            return 1;
        }

        double potencia = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            potencia *= base;

}
    //Si el exponente es negativo, tomar reciproco
    if (exponente < 0) {
        potencia=1 /potencia;
    }
    return potencia;
    }
}