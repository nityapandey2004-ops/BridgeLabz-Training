import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Step 2: Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Step 3: Create String array
        String[] result = new String[number + 1];

        // Step 4: Loop from 0 to number
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } 
            else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } 
            else {
                result[i] = String.valueOf(i);
            }
        }

        // Step 5: Display results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
