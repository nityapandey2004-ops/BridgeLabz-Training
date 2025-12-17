import java.util.Scanner;

public class FeeInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculations
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee );
    }
}
