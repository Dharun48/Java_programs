/******************************************************************************

 
 	
Q8.Java Program to find whether the last digit of given number is divisible by 3


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=a%10;
	    if(b%3==0)
	    {
		System.out.println("Divisible by 3");
	    }
	    else
	    {
	        System.out.println("Not divisible by 3");
	    }
	}
}
