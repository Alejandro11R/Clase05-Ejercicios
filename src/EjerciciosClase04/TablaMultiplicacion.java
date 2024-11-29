package EjerciciosClase04;

import java.util.Scanner;

public class TablaMultiplicacion {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        //User interaction
        System.out.println("Enter the number to generate the multiplication table: ");
        var number = scanner.nextInt();

        //Generate and dispaly the multiplication table
        generateMultiplicationTable(number);

        scanner.close();
    }

    //Mehtod to generate and display the multiplication table
    public static void generateMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            //Using print for formatted output
            System.out.printf("%d x %d = %d%n", number, i, number * i);
}
}
}