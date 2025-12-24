import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is already present
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
