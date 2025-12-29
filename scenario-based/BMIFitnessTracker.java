import java.util.Scanner;

public class BmiFitnessTracker {

    public static void main(String[] args) {

        // Scanner 
        Scanner scanner = new Scanner(System.in);

        // Variables to store height, weight, and BMI
        double heightInMeters;
        double weightInKg;
        double bmi;

        System.out.println(" Welcome to Maya's BMI Fitness Tracker ");

        // Taking height input
        System.out.print("Enter height in meters: ");
        heightInMeters = scanner.nextDouble();

        // Taking weight input
        System.out.print("Enter weight in kilograms: ");
        weightInKg = scanner.nextDouble();

        // BMI calculation
        bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display calculated BMI
        System.out.println("\nYour BMI is: " + bmi);

        // Determining BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }
    }
}
