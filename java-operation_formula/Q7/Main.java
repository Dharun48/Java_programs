/******************************************************************************
Q7.Write a Java Program to calculate Javaelsius to Fahrenheit
*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     Double c=s.nextDouble();
     Double a=(c*9/5)+32;
     System.out.println(a);
    }
}