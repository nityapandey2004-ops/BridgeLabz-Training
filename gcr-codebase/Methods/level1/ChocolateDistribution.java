import java.util.Scanner;

public class ChocolateDistribution {

    // Method
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Validation
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else {
            // Calling method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates are " + result[1] + ".");
        }
    }
}
