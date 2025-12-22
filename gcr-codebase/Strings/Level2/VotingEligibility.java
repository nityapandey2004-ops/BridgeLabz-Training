import java.util.Scanner;

public class VotingEligibility {

    // Method
    public static int[] getStudentAges(int n, Scanner sc) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";   // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";    // Can vote
            } else {
                result[i][1] = "false";   // Cannot vote
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        // Step 1: Get ages
        int[] ages = getStudentAges(numberOfStudents, sc);

        // Step 2: Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Step 3: Display result
        displayResult(result);
    }
}
