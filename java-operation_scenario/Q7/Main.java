/******************************************************************************
A teacher distributes candies equally among students.
The program finds how many candies each student gets and how many remain undistributed.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the amount of candies:");
	    int a=s.nextInt();
	    System.out.print("Enter the number of students:");
	    int b=s.nextInt();
	    int c=a/b;
	    int d=a%b;
	    
		System.out.println("Each get:"+c+"\n"+"Remaining:"+d);
	}
}
