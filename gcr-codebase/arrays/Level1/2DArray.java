import java.util.Scanner;

public class 2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Step 2: Create 2D array
        int[][] matrix = new int[rows][columns];

        // Step 3: Take input for 2D array
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // Step 5: Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 6: Display 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
