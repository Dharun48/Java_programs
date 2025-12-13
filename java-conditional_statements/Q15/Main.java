/******************************************************************************
Q15. Java Program to check whether a number is divisible by either 3 or 7

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if((n%3==0))
	    {
		System.out.println("Divisible by 3");
	    }
	
	     else if(n%7==0)
	    {
		System.out.println("Divisile by 7");
	    }
	    else{
	        System.out.println("Either not");
	    }
	}
}
