/******************************************************************************
A computer networks student wants to convert bytes into bits. Since 1 byte = 8 bits, 
the program multiplies accordingly.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter in bytes:");
	    int a=s.nextInt();
		System.out.println("in bits:"+(a*8));
	}
}
