import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Not a natural number");
            return;
        }

        // Create arrays
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
