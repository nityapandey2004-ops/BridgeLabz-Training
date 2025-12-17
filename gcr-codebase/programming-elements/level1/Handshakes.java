import java.util.Scanner;

public classHandshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying output
        System.out.println(
            "The maximum number of possible handshakes is " + handshakes );
    }
}
