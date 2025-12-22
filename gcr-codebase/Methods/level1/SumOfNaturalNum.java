import java.util.Scanner;

public class SumOfNaturalNum {

    // creating Method
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

            // Calling method
            int result = findSum(n);

            // Output
            System.out.println("The sum of " + n + " natural numbers is " + result);
        
    }
}
