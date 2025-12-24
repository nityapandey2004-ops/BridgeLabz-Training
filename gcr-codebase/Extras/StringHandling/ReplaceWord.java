import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        // Replace word
        String updatedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Updated sentence:");
        System.out.println(updatedSentence);
    }
}
