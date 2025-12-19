import java.util.Scanner;

public class AbundantNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Check for positive integer
        if (number > 0) {

            // Find all divisors except the number itself
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }

            // Check if abundant
            if (sum > number) {
                System.out.println("Abundant Number");
            } else {
                System.out.println("Not an Abundant Number");
            }

        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
