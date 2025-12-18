import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the countdown number: ");
        int counter = sc.nextInt();

        // while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement the counter
        }

        System.out.println("Rocket Launched!");
    }
}
