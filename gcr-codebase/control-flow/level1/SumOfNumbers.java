import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Takinng first input
        System.out.print("Enter a number (0 to stop): ");
        double number = sc.nextDouble();

            while (number != 0) {
            total = total + number;

            // taking next input
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Display the total
        System.out.println("Total sum is: " + total);
    }
}
