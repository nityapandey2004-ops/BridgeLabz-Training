import java.util.Scanner;
public class SpringSeason{

   //creating method
   public static boolean isSpringSeason(int month, int day){

       // spring season:march 20 to june 20
       if((month == 3 && day >= 20)|| (month==4)||(month==5)||(month ==6 && day<=20)) {
           return true;
        }else{
    return false;
    }
  }
  public static void main(String[]args) {
          
    // taking input
     int month = Integer.parseInt(args[0]);
     int day = Integer.parseInt(args[1]);

     // calling method
     boolean result= isSpringSeason(month,day);
   
    //output
   if(result){
        System.out.println("Its a spring Season");
    } else {
        System.out.println("Not a spring Season");
    }
   }
}