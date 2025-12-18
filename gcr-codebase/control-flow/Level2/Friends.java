import java.util.Scanner;

public class Friends{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Taking height input
        System.out.print("Enter Amar's height: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter Akbar's height: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter Anthony's height: ");
        int heightAnthony = sc.nextInt();

        // Finding youngest friend
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is the youngest friend");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is the youngest friend");
        } else {
            System.out.println("Anthony is the youngest friend");
        }

        // Finding tallest friend
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Amar is the tallest friend");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Akbar is the tallest friend");
        } else {
            System.out.println("Anthony is the tallest friend");
        }
    }
}
