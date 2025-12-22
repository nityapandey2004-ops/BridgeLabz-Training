import java.util.Scanner;

public class NumberFormatException {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        // This will throw NumberFormatException if text is not a number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method 
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught and handled.");
            System.out.println("Reason: Input text is not a valid number.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        //  Calling method that generates exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        //  Calling method that handles exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }
}
