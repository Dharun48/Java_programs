/******************************************************************************
 
 	Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number
 	
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=a%10;
	    int d=a/100;
	 	System.out.println(d+b);
	}
}