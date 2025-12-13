/******************************************************************************
A person deposits money in the bank. Using the formula SI = (P × R × T) / 100,
the program computes simple interest.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the Principle:");
		Double p=s.nextDouble();
			System.out.print("Enter the Rate of Intrest:");
		Double r=s.nextDouble();
			System.out.print("Enter the time period:");
		Double t=s.nextDouble();
			System.out.printf("Intrest:"+"%.2f",(p*r*t)/100);
		
	}
}
