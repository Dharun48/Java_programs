/******************************************************************************
 
Q4.Write a Java Program to find area of Circle

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int r=s.nextInt();
    
     System.out.printf("%.2f",3.14159*(r*r));
    }
}