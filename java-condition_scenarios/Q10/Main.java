/******************************************************************************
Q10.Write a Java program to print "Stop / Ready / Go" based on traffic light color.

*******************************************************************************/
import java.util.Scanner;


public class Main{
  public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      String color=s.next().toLowerCase();
      if(color.equals("red"))
      {
         System.out.println("Stop");
      }
      else if(color.equals("yellow"))
      {
         System.out.println("Ready");
      }
      else
      {
         System.out.println("Go");
      }
    
    }
}
  
