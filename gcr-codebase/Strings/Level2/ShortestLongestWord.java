import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length without using length()
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

    // Method 
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < Integer.parseInt(wordLengthArray[minIndex][1])) {
                minIndex = i;
            }

            if (currentLength > Integer.parseInt(wordLengthArray[maxIndex][1])) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split into words
        String[] words = splitUsingCharAt(text);

        // Create 2D array
        String[][] wordLengthArray = createWordLengthArray(words);

        // Find shortest and longest
        int[] result = findShortestAndLongest(wordLengthArray);

        // Display
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(
                wordLengthArray[i][0] + "\t\t" +
                Integer.parseInt(wordLengthArray[i][1])
            );
        }

        System.out.println("\nShortest Word: " + wordLengthArray[result[0]][0]);
        System.out.println("Longest Word : " + wordLengthArray[result[1]][0]);

    }
}
