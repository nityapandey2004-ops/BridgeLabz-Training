import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Define an integer array of size 5
        int[] numbers = new int[5];

        // Step 2: Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Check each number
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (num > 0) {
                // Positive number
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } 
            else if (num < 0) {
                // Negative number
                System.out.println(num + " is Negative");
            } 
            else {
                // Zero
                System.out.println(num + " is Zero");
            }
        }

        // Step 4: Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");

        if (first == last) {
            System.out.println("First element is equal to last element");
        } 
        else if (first > last) {
            System.out.println("First element is greater than last element");
        } 
        else {
            System.out.println("First element is less than last element");
        }

    }
}
