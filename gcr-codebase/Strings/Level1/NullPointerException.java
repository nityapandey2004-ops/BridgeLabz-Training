public class NullPointerException {

    // Method to generate NullPointerException
    public static void generateException() {

        String text = null;   // text is initialized to null

        // This line will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {

        String text = null;   // text is initialized to null

        try {
            // Trying to access String method
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled.");
            System.out.println("Reason: You are trying to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        //  Calling method that generates exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException() method.");
        }

        //  Calling method that handles exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
