/******************************************************************************

 
Q13.Write a Java program to display mobile battery status (full, moderate, low).


*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter the Battery percentage:");
      int a=s.nextInt();
      if(a>=0&&a<=100)
      {
      if(a==100)
      {
          System.out.println("Full");
      }
      else if(a<=20)
       {
        System.out.println("Low");
      }
    
      else{
          System.out.println("Moderate");
      }
      }
      
     
      
  }
} 
