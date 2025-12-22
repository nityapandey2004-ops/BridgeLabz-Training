import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method 
    public static void generateException(String[] names) {

        // Accessing index beyond array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Accessing index beyond array length
            System.out.println(names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
            System.out.println("Reason: Index is outside the valid range of the array.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of names
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Taking array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        //  Calling method that generates exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        //  Calling method that handles exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }
}
