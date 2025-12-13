/******************************************************************************

Q12. Java Program to check whether the last digit of a number is odd or even

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=a%10;
	    if(b%2==0)
	    {
		System.out.println("Even");
	    }
	     else
	    {
		System.out.println("Odd");
	    }
	}
}
