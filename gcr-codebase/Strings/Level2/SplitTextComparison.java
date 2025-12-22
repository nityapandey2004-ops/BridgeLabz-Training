import java.util.Scanner;

public class SplitTextComparison {

    // Method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        // Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceCount) ? spaceIndexes[i] : length;
            String word = "";

            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (findLength(arr1[i]) != findLength(arr2[i])) {
                return false;
            }

            for (int j = 0; j < findLength(arr1[i]); j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manualSplit = splitUsingCharAt(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(manualSplit, builtInSplit);

        // Display output
        System.out.println("\nWords using user-defined method:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        if (result) {
            System.out.println("\nBoth results are SAME.");
        } else {
            System.out.println("\nBoth results are DIFFERENT.");
        }
    }
}
