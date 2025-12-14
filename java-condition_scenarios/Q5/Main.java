/******************************************************************************
Q5.Write a Java program to check if temperature is above 100 (fever check).

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      if(a>100)
      {
        System.out.println("Fever");
      }
     
     
       else 
      {
         System.out.println("Not a fever");
      }
     
      
  }
} 
