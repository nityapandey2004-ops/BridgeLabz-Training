import java.util.Scanner;

public class TriangularRun{

   //creating method
   public static double calculateRounds(double s1,double s2, double s3){
        double parimeter=s1+s2+s3;
        double totalDistance= 5000;
        return totalDistance/parimeter;
   }

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
  
      //taking user input 
      System.out.print(" Enter first side of the park (in meters): ");
      double s1 = sc.nextDouble();

      System.out.print(" Enter second side of the park (in meters): ");
       double s2= sc.nextDouble();

      System.out.print(" Enter third side of the park (in meters): ");
       double s3 = sc.nextDouble();
 
     // calling the method
        double Rounds = calculateRounds(s1,s2,s3);

     // output
     System.out.println( " The Athelete must complete " + Rounds + " rounds to run 5 km. ");
}
}