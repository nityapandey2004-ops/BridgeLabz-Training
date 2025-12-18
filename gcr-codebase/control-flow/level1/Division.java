import java.util.scanner;

class Divisibility{
    public static void main(String[] args){
       //  Create Scanner object to take input
        Scanner sc= new Scanner(System.in);

       //Read the number from user
         int number = sc.nextInt();

        // Check divisibility by 5
        boolean result = (number % 5 == 0);

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}