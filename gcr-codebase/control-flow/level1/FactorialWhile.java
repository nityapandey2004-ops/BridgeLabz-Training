import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check for natural number
        if (num <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int factorial = 1;
            int i = 1;

            //  using while loop
            while (i <= num) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
