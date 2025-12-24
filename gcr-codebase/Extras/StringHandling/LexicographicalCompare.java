import java.util.Scanner;

public class LexicographicalCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean isDifferent = false;

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                } else {
                    System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                }
                isDifferent = true;
                break;
            }
        }

        // If all characters are same till min length
        if (!isDifferent) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}
