import java.util.Scanner;

class NaturalNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking natural number
        if (number >= 0) {

            // Formula for sum of n natural numbers
            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
