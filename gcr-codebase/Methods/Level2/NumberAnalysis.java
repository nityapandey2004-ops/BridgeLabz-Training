import java.util.Scanner;

public class NumberAnalysis {

    // Method 
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // returns 1 if number1 > number2
    // returns 0 if equal
    // returns -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 < number2)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking positive/negative and even/odd
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Comparing first and last element
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last element:");
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element");
        } else if (comparisonResult == -1) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First and last elements are equal");
        }
    }
}
