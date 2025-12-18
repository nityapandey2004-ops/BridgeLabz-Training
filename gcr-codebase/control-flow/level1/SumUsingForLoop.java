import java.util.Scanner;

public class SumUsingForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if number is a natural number
        if (n > 0) {

            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Calculate sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
