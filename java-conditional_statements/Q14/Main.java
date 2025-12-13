/******************************************************************************
Q14. Java Program to check whether a number is divisible by both 3 and 5

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if((n%3==0)&&(n%5==0))
	    {
		System.out.println("Divisible by both 3 and 5");
	    }
	
	     else
	    {
		System.out.println("Not divisible by both 3 and 5");
	    }
	}
}
