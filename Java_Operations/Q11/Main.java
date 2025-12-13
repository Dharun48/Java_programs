/******************************************************************************
 
 	Q11.Write a Java Program to print the middle digit of a 3-digit number.
 	
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    a/=10;
	 	System.out.println(a%10);
	}
}