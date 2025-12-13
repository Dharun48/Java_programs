/******************************************************************************
Q6.Write a Java Program to calculate Fahrenheit to celsius
*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     Double f=s.nextDouble();
     Double a=(f-32)*5/9;
     System.out.println(a);
    }
}