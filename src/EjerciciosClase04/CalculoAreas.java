package EjerciciosClase04;

import java.util.Scanner;

public class CalculoAreas {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Calcular area de un circulo
        System.out.println("Ingrese el radio del círculo: ");
        var radio = scanner.nextDouble();
        var areaCirculo= CalcularAreaCirculo(radio);
        System.out.println("The area of the circle is: " + areaCirculo);

        //Calcular el are del cuadrado
        System.out.println("Enter the length of the side of the square: ");
        var lado = scanner.nextDouble();
        var areaCuadrado = CalcularAreaCuadrado(lado);
        System.out.println("The area of the square is: " + areaCuadrado);

        //Calcular el area del triangulo
        System.out.println("Enter the base of the triangle: ");
        var base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        var altura = scanner.nextDouble();
        var areaTriangulo = CalcularAreaTriangulo(base, altura);
        System.out.println("The area of the triangle is: " + areaTriangulo);

    }
    //metodo para calcular el area del circulo
    public static double CalcularAreaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    //MEtodo para calcular el aera del ciruclo
    public static double CalcularAreaCuadrado(double lado){
        return Math.pow(lado, 2);
}
    //metodo para calcular el area del triangulo
    public static double CalcularAreaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }
}
