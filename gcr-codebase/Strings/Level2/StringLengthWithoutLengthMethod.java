import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length without using length()
    public static int findLengthWithoutLength(String text) {

        int count = 0;

        try {
            while (true) {          // Infinite loop
                text.charAt(count); // Access character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method result
        int manualLength = findLengthWithoutLength(text);

        // Built-in method result
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength without using length(): " + manualLength);
        System.out.println("Length using length() method: " + builtInLength);
    }
}
