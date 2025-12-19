import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

               double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        //  Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            //  Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            //  Break if array size reaches 10
            if (index == 10) {
                break;
            }

            //  Store value and increment index
            numbers[index] = input;
            index++;
        }

        //  Display numbers and calculate sum
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        //  Display total
        System.out.println("\nTotal sum = " + total);
    }
}
