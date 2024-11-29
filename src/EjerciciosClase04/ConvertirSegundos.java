package EjerciciosClase04;

import java.util.Scanner;

public class ConvertirSegundos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        // User interaction to get the number of seconds
        System.out.println("Enter the number of seconds:");
        var totalSeconds = scanner.nextLong();
        
        // Convert seconds to days, hours, minutes, and seconds
        convertSeconds(totalSeconds);
        
        scanner.close();
    }

    // Method to convert seconds to days, hours, minutes, and seconds
    public static void convertSeconds(long totalSeconds) {
        long days = totalSeconds / 86400; // 1 day = 86400 seconds
        totalSeconds %= 86400; // Remaining seconds after extracting days
        
        long hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        totalSeconds %= 3600; // Remaining seconds after extracting hours
        
        long minutes = totalSeconds / 60; // 1 minute = 60 seconds
        long seconds = totalSeconds % 60; // Remaining seconds after extracting minutes
        
        // Display results
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
