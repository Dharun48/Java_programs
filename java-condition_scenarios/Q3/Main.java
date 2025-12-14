/******************************************************************************

Q3.Write a Java Program to check whether a person is eligible for 
senior citizen benefits (age ≥ 60)

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      if(a>=60)
      {
        System.out.println("eligible for senior citizen");
      }
     
      else{
         System.out.println("Not Eligible for senior citizen");
      }
     
      
  }
} 
