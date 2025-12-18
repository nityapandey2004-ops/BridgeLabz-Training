import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;

        // Check for positive integer
        if (number > 1) {

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {

                // Check if i is a factor
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   // stop after finding the greatest factor
                }
            }

            System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        } else {
            System.out.println("Please enter a positive integer greater than 1");
        }
    }
}
