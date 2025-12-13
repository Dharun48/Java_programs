/******************************************************************************
 
 	
A company calculates employee salary using: Basic + HRA + Allowance.
The program must compute the total salary.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter basic:");
	    int a=s.nextInt();
		System.out.print("Enter HRA:");
	    int b=s.nextInt();
	    System.out.print("Enter Allowance:");
	    int c=s.nextInt();
	    System.out.println("Total Salary:"+(a+b+c));
	}
}
