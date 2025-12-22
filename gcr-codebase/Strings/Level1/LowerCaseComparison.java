import java.util.Scanner;

public class LowerCaseComparison {

    // Method
    public static String convertToLowerCaseUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
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

        // User-defined lowercase conversion
        String manualLower = convertToLowerCaseUsingCharAt(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // Comparing both results
        boolean result = compareStringsUsingCharAt(manualLower, builtInLower);

        // Display results
        System.out.println("\nLowercase using charAt(): " + manualLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);

        if (result) {
            System.out.println("\nBoth results are SAME.");
        } else {
            System.out.println("\nBoth results are DIFFERENT.");
        }
    }
}
