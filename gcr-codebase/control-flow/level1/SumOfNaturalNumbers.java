import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether number is a natural number
        if (n > 0) {

            // using while loop
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // sum using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            // Comparing results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results are not matching.");
            }

        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
