/******************************************************************************
Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    
	    if(a>0&&a<9)
	    {
	        System.out.println("Single Digit");
	    }
	    else if(a>10&&a<99)
	    {
	        System.out.println("Double Digit");
	    }
	    else{
	        System.out.println("Three digit");
	    }
	}
}
