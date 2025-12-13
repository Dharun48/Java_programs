/******************************************************************************
 
Q15. Write a Java Program to calculate the average of three numbers
 	
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    float d=(a+b+c);
	 	System.out.printf("%.2f",d/3);
	}
}