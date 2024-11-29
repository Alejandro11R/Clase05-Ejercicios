package EjerciciosClase04;

import java.util.Scanner;

public class CalculoInteres {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // User interaction for Simple Interest
        System.out.println("Simple Interest Calculation");
        System.out.println("Enter the principal amount:");
        var principal = scanner.nextDouble();
        System.out.println("Enter the annual interest rate (in percentage):");
        var rate = scanner.nextDouble() / 100; // Convert to decimal
        System.out.println("Enter the time in years:");
        var time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest is: " + simpleInterest);

        // User interaction for Compound Interest
        System.out.println("\nCompound Interest Calculation");
        System.out.println("Enter the principal amount:");
        principal = scanner.nextDouble();
        System.out.println("Enter the annual interest rate (in percentage):");
        rate = scanner.nextDouble() / 100; // Convert to decimal
        System.out.println("Enter the time in years:");
        time = scanner.nextDouble();
        System.out.println("Enter the number of times interest is applied per year:");
        var times = scanner.nextDouble();

        double totalAmount = calculateCompoundInterest(principal, rate, times, time);
        double compoundInterest = totalAmount - principal;
        System.out.println("The total amount after " + time + " years is: " + totalAmount);
        System.out.println("The compound interest is: " + compoundInterest);

        scanner.close();
    }

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double P, double r, double t) {
        return P * r * t; // Formula for simple interest
    }

    // Method to calculate Compound Interest
    public static double calculateCompoundInterest(double P, double r, double n, double t) {
        return P * Math.pow(1 + (r / n), n * t); // Formula for compound interest
    }
}
