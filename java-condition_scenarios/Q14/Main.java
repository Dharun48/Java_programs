/******************************************************************************

 
Q14.Write a Java program to assign ticket price based on passenger age (child, adult, senior).


*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter the Age:");
      int a=s.nextInt();
      if(a>=0&&a<=120)
      {
      if(a<=12)
      {
          System.out.println("Child");
      }
      else if(a<=59)
       {
        System.out.println("Adult");
      }
    
      else{
          System.out.println("Senior");
      }
      }
      
     
      
  }
} 
