import java.util.*;
public class Handshakes{

   //creating method
   public static int calculateHandshakes(int n){
       return(n*(n-1))/2;
   }

   public static void main(String[] args){

      Scanner sc= new Scanner(System.in);
      
      //taking input from user
      System.out.print("Enter Number of students:");
       
      int n = sc.nextInt();
      //calling method
      int handshakes =   calculateHandshakes(n);        

      // displaying output
      System.out.println(" The maximum number of possible handshales is " + handshakes);

  }
}