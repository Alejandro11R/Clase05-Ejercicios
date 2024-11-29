package EjerciciosClase04;

import java.util.Scanner;

public class CalculoFactorial {
    

    //Method to calculate the factorial of a positive integer
    public static long CalculoFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
    }
    return factorial;
}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User interaction
        System.out.println("Entear a positive integer: ");
        int n = scanner.nextInt();

        //Chechk if the numbre is posi tive
        if (n < 0) {
            System.out.println("Please enter a positive integer");

        }else {
            //Calculate Factorial
            long result = CalculoFactorial(n);
            System.out.println(" The factorial of " + n + " is: " + result);
        }
    }
}
