/******************************************************************************

Q4.Write a Java program to display mobile Batterycheck
"Low Battery", "50% consumed", or "Battery Full".

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      if(a==100)
      {
        System.out.println("Battery full");
      }
     
      else if(a==50)
      {
         System.out.println("50% consumed");
      }
       else 
      {
         System.out.println("Low battery");
      }
     
      
  }
} 
