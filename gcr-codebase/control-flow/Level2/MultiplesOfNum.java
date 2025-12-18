import java.util.Scanner;

public class MultiplesOfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive number less than 100
        if (number > 0 && number < 100) {

            int counter = 100;

            // while loop
            while (counter > 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--; // decrement counter
            }

        } else {
            System.out.println("Please enter a positive number less than 100");
        }
    }
}
