/******************************************************************************
Q9.Write a Java program to check if withdrawal amount ≤ balance and is
a multiple of 100 (ATM Withdrawal Validation)..

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      int amount=s.nextInt();
      int a=2500;
      if(a>=amount)
      {
          System.out.println("suffient balance");
          if(amount%100==0)
          {
               System.out.println("Multiple of 100");
          }
          else
            System.out.println("Not a multiple of 100");
      }
      else{
          System.out.println("insuffient balance");
         if(amount%100==0)
          {
               System.out.println("Multiple of 100");
          }
          else
            System.out.println("Not a multiple of 100");
      }
    
    }
}
  
