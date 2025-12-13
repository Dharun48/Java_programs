/******************************************************************************
 
 	
A product is sold at a loss. Given selling price and loss amount,
the program calculates the cost price using: CP = SP + Loss.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("SP:");
	    int a=s.nextInt();
		System.out.print("loss:");
	    int b=s.nextInt();
	    System.out.println("Cost price:"+(a+b));
	}


}
