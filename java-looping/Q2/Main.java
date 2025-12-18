/******************************************************************************
 
Q2. Write a Java program to find whether the first digit of a given number is 
odd or even.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		while(a>2)
		{
		    a=a/10;
		}
		if(a%2==0)
		{
		    System.out.println("Even");
		}
			else
		{
		    System.out.println("Odd");
		}
	}
}
