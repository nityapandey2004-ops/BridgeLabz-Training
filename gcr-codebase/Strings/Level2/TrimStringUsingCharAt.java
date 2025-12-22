import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end+1 for substring logic
    }

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
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

        // Input
        System.out.print("Enter the text with spaces: ");
        String text = sc.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Manual trim using charAt()
        String manualTrim = createSubstringUsingCharAt(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare results
        boolean result = compareStringsUsingCharAt(manualTrim, builtInTrim);

        // Display
        System.out.println("\nTrimmed text using charAt(): [" + manualTrim + "]");
        System.out.println("Trimmed text using trim():   [" + builtInTrim + "]");

        if (result) {
            System.out.println("\nBoth results are SAME.");
        } else {
            System.out.println("\nBoth results are DIFFERENT.");
        }
    }
}
