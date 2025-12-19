import java.util.Scanner;

public class PrimeNum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Prime check works only for numbers greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // number is divisible, so not prime
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
