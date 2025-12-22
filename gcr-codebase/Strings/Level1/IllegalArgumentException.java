import java.util.Scanner;

public class IllegalArgumentException {

    // Method
    public static void generateException(String text) {

        // Start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // Start index is greater than end index
            System.out.println(text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
            System.out.println("Reason: Start index is greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        //  Calling method that generates exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        //  Calling method that handles exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);
    }
}
