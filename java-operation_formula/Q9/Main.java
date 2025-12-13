/******************************************************************************
Q9.Write a Java Program to find Perimeter of a Rectangle
*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     Double l=s.nextDouble();
     Double b=s.nextDouble();
     System.out.println(2*(l+b));
    }
}