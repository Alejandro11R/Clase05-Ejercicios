package EjerciciosClase04;

import java.util.Scanner;

public class CalculoMasaCorporal {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        // User interaction to get weight and height
        System.out.println("Enter your weight in kg:");
        var weight = scanner.nextDouble();

        System.out.println("Enter your height in meters");
        var height = scanner.nextDouble();

        // Calculate Bmi
        double bmi = calculateBMI(weight, height);

        // Determine BMI category
        String category = determineBMICategiry(bmi);

        // Display results
        System.out.printf("Your BMI is: %.2f%n", bmi);

        System.out.println("Category:" + category);

        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);// BMI formula

    }

    // Method to determine bMI caregory
    public static String determineBMICategiry(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";

        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesity Grade I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesity Grade II";
        } else {
            return "Obesity Grade III";
        }
    }
}