import java.util.Scanner;

public class Multiples{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive number less than 100");
        }
    }
}
