import java.util.Scanner;

public class UpperCaseComparison {

    // Method 
    public static String convertToUpperCaseUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            } else {
                result = result + ch;
            }
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String manualUpper = convertToUpperCaseUsingCharAt(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Comparing both results
        boolean result = compareStringsUsingCharAt(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nUppercase using charAt(): " + manualUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);

        if (result) {
            System.out.println("\nBoth results are SAME.");
        } else {
            System.out.println("\nBoth results are DIFFERENT.");
        }

    }
}
