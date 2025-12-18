import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the countdown number: ");
        int counter = sc.nextInt();

        //  using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
    }
}
