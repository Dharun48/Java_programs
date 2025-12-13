/******************************************************************************
 * 
A shop offers festival discounts. The customer enters the original price and discount percentage. 
The program must calculate the discount amount and the final price payable after applying the
discount.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Amount:");
		int a=s.nextInt();
		System.out.print("DIscount:");
		int d=s.nextInt();
		int f=(a*d)/100;
		System.out.println("Final Price:"+(a-f));
	}
}
