/******************************************************************************
Q16. Java Program to check whether a number is divisible by both 2 and 5 but not by 8.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if((n%2==0)&&(n%5==0)&&(n%8!=0))
	    {
		System.out.println("divisible by both 2 and 5 but not by 8.");
	    }
	    else{
	        System.out.println("not");
	    }
	}
}
