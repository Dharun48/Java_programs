/******************************************************************************
 
 	
Q1. Write a Java program to print the first digit of a given number.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		while(a>1)
		{
		    a=a/10;
		}
		System.out.println(a);
	}
}
