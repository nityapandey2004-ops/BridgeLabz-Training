import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 0) {

            int counter = 1;

            // While loop to find factors
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
