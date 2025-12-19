import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // store original number
        int sum = 0;                 // initialize sum to 0

        // Loop till originalNumber becomes 0
        while (originalNumber != 0) {

            // Find last digit
            int digit = originalNumber % 10;

            // Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
