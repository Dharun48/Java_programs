/******************************************************************************
Q17. Java Program to check whether two numbers have the same last digit

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int n=a%10;
	    int n1=b%10;
	    if(n==n1)
	    {
		System.out.println("Two numbers have the same last digit");
	    }
	    else{
	        System.out.println("Not Same number");
	    }
	}
}
