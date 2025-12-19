import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // store original value
        int sum = 0;

        // Loop to find sum of digits
        while (number != 0) {
            int digit = number % 10;  // get last digit
            sum = sum + digit;        // add digit to sum
            number = number / 10;     // remove last digit
        }

        // Check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
