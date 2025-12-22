import java.util.Scanner;

public class ArrayComparasion {

    // Method to return characters using charAt()
    public static char[] getCharactersUsingCharAt(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the string: ");
        String text = sc.next();

        // User-defined method result
        char[] userArray = getCharactersUsingCharAt(text);

        // Built-in method result
        char[] builtInArray = text.toCharArray();

        // Comparing both arrays
        boolean result = compareCharArrays(userArray, builtInArray);

        // Display user-defined method output
        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        // Display built-in method output
        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        // Display comparison result
        if (result) {
            System.out.println("\n\nBoth character arrays are SAME.");
        } else {
            System.out.println("\n\nBoth character arrays are DIFFERENT.");
        }
    }
}
