import java.util.Scanner;

public class SumUntillZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            // STOP condition (very important)
            if (number <= 0) {
                break;   // loop will stop here
            }

            // Add only positive numbers
            total = total + number;
        }

        System.out.println("Total sum is: " + total);
    }
}
