/******************************************************************************

Q18.Write a Java Program to print whether a number is positive or negative.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     System.out.println((n>0)?"Positive":"Negative");
    }
}