/******************************************************************************

 
 	
Q12.Write a Java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.


*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter the temperature(inDegrees):");
      double a=s.nextDouble();
      if(a<=20)
      {
          System.out.println("Cold");
      }
      else if(a<=30)
       {
        System.out.println("Plesant");
      }
      else if(a<=35)
       {
        System.out.println("hot");
      }
      else{
          System.out.println("Heatwave");
      }
     
      
  }
} 
