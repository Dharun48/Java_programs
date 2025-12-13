/******************************************************************************
A bakery produces a fixed number of cakes every hour.
Given cakes per hour and total hours, the program calculates total cakes made.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the amount of Cakes:");
	    int a=s.nextInt();
	    System.out.print("Enter the Hours:");
	    int b=s.nextInt();
	    int c=a*b;
	    
		System.out.println("Total cakes:"+c);
	}
}
