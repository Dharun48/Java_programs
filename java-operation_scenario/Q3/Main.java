/******************************************************************************
 
 	
Three friends eat at a restaurant and get a single bill. They want to split the total bill equally.
The program calculates how much each friend must pay.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Total bill:");
		Double a=s.nextDouble();
		System.out.printf("Final Price:"+"%.2f",(a/3));
	}
}
