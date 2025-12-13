/******************************************************************************
Q13. Java Program to check whether a number is positive, negative, or zero

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n==0)
	    {
		System.out.println("Zero");
	    }
	     else if(n>0)
	    {
		System.out.println("Positive");
	    }
	
	     else
	    {
		System.out.println("Negative");
	    }
	}
}
