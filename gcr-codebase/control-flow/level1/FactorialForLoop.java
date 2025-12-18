import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check for natural number
        if (num <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
