/******************************************************************************
Q19. Java Program to check whether the product of two numbers is positive or negative

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int n=a*b;
	    if(n>0)
	    {
		System.out.println("Positive");
	    }
	    else if(n<0)
	    {
	        System.out.println("Negative");
	    }
	    else{
	        System.out.println("Zero");
	    }
	}
}
