import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize greatestFactor
        int greatestFactor = 1;

        // Start counter from number - 1
        int counter = number - 1;

        // Check for positive integer
        if (number > 0) {

            // While loop till counter reaches 1
            while (counter >= 1) {

                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // stop once greatest factor is found
                }

                counter--;
            }
            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
