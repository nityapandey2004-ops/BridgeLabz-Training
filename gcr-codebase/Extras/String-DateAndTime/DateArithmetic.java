import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

       // Taking date input
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

       LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7)
                                     .plusMonths(1)
                                     .plusYears(2);

        // Subtracting 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        
       System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);

    }
}
