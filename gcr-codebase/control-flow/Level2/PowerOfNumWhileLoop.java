import java.util.Scanner;

public class PowerOfNumWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Result variable
        int result = 1;

        // Counter variable
        int counter = 0;

        // While loop till counter == power
        while (counter != power) {
            result = result * number;
            counter++;
        }

        // Print result
        System.out.println("Result = " + result);
    }
}
