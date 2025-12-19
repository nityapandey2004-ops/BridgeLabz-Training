import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check the number
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
