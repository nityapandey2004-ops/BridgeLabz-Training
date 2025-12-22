 import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double SI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calling method
        double simpleInterest = SI(principal, rate, time);

       
      System.out.println ("The Simple Interest is " + simpleInterest + " for Principal " + principal +  " Rate of Interest " + rate + " and Time " + time );
    }
}
