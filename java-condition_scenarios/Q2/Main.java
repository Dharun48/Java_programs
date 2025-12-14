/******************************************************************************

Q2.Write a Java Program to check whether a person is eligible to vote (age ≥ 18)

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      if(a>=18)
      {
        System.out.println("Eligible for vote");
      }
     
      else{
         System.out.println("Not Eligible for vote");
      }
     
      
  }
} 
