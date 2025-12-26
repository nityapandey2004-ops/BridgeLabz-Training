import java.util.Scanner;

public class PrimeNumberChecker {

    // Method 
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = isPrime(num);

        if (result) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
