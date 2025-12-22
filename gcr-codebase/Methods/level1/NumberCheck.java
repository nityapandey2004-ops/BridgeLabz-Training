import java.util.Scanner;
public class NumberCheck{

    //creating method
     public static int checkNum(int n){
     if(n >0){
        return 1;
     } else if (n <0){
        return -1;
     }else{
        return 0;
     }
 }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     
    // talking user input 
    System.out.println(" Enter an Integer:");
     int n= sc.nextInt();
 
    // calling method
    int result= checkNum(n);

   //output
if(result==1){
   System.out.println("the number is positive.");
    }else if (result== -1){
   System.out.println("the number is Negative.");
   }else{
    System.out.println("the number is Zero");
   }
  } 
}
