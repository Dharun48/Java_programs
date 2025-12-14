/******************************************************************************
Q6.Write a Java program to check pass/fail based on marks (marks ≥ 35 = pass).

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      if(a>=35)
      {
        System.out.println("Pass");
      }
     
     
       else 
      {
         System.out.println("Fail");
      }
     
      
  }
} 
