/******************************************************************************
Q11. Java Program to check whether the first digit of a 3 digit number is odd or even

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int c=a/100;
	    if(c%2==0)
	    {
		System.out.println("Even");
	    }
	    else
	    {
	        System.out.println("Odd");
	    }
	}
}
