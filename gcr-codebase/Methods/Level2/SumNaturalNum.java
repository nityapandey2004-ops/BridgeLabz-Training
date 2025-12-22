import java.util.Scanner;

public class SumNaturalNum {

    //  method
    public static int sumRecursive(int n) {
        if (n == 0)
            return 0;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sum1 = sumRecursive(n);
            int sum2 = sumFormula(n);

            System.out.println("Sum using recursion: " + sum1);
            System.out.println("Sum using formula: " + sum2);

            if (sum1 == sum2) {
                System.out.println("Both results are correct and equal.");
            }
        }
    }
}
