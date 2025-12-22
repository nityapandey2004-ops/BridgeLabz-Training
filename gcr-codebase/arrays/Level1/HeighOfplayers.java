import java.util.Scanner;

public class HeightOfPlayers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array for heights
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights
        System.out.println("Enter height of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display mean
        System.out.println("Mean height of football team = " + mean);
    }
}
