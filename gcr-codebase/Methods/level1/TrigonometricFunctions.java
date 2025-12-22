import java.util.Scanner;

public class TrigonometricFunctions {

    // Method 
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value is: " + result[0]);
        System.out.println("Cosine value is: " + result[1]);
        System.out.println("Tangent value is: " + result[2]);
    }
}
