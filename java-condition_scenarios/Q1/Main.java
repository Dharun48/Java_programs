/******************************************************************************

Q1.Write a Java Program to calculate different discount for different Bill amount

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      double a=s.nextDouble();
      double discount=0;
      if(a<1000)
      {
         discount=0.05;
      }
      else if(a<1500)
       {
         discount=0.10;
      }
      else if(a<1500)
       {
         discount=0.13;
      }
      else{
          discount=0.15;
      }
      double dp=a*discount;
      double f=a-dp;
            System.out.println("Discount price:"+dp);
      System.out.println("Final Amount:"+f);
      
  }
} 
