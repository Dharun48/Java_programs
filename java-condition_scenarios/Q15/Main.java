/******************************************************************************

 
Q15.Write a Java program to check whether vehicle speed exceeds 100 km/h.


*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter the Speed:");
      int a=s.nextInt();
      
      if(a<=100)
      {
          System.out.println("below the speed limit");
      }
     
      else{
          System.out.println("Above the speed limit");
      }
      }
      
     
      
  
} 
