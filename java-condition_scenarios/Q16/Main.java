/******************************************************************************

 
Q16.Write a Java program to validate a mobile number . 
If it has 10 or more digits, print “Valid Number”, otherwise print “Invalid Number”.


*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter the Phone number:");
      String a=s.next();
      
      if(a.length()<10)
      {
          System.out.println("Invalid");
      }
     
      else{
          System.out.println("Valid");
      }
   }
  
} 
